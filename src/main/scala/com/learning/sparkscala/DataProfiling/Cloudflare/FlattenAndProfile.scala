package com.learning.sparkscala.DataProfiling.Cloudflare

import com.amazon.deequ.VerificationSuite
import com.amazon.deequ.checks.{Check, CheckLevel, CheckStatus}
import com.amazon.deequ.constraints.ConstraintStatus
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, explode, length}
import org.apache.spark.sql.types.StringType

import scala.util.matching.Regex

object FlattenAndProfile extends App{

  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

spark.sparkContext.setLogLevel("WARN")

  val parfile = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\tenantSample")
  //parfile.show
  //parfile.show
parfile.printSchema()
  val x = parfile
  .withColumn("_aepgdcdevenablement2botEvents" , explode(col("_aepgdcdevenablement2.botEvents"))).
  withColumn("_aepgdcdevenablement2botEventszoneInfo",explode(col("_aepgdcdevenablement2botEvents.zoneInfo"))).
  select("_id","eventType","timestamp","_aepgdcdevenablement2botEvents.accountID","_aepgdcdevenablement2botEvents.customerType",
    "_aepgdcdevenablement2botEventszoneInfo.autoPct",
    "_aepgdcdevenablement2botEventszoneInfo.avgAutoPct",
    "_aepgdcdevenablement2botEventszoneInfo.diff",
    "_aepgdcdevenablement2botEventszoneInfo.zoneID",
    "_aepgdcdevenablement2botEventszoneInfo.zoneName",
    "_aepgdcdevenablement2botEventszoneInfo.zonePlan",
    "_aepgdcdevenablement2botEventszoneInfo.zoneRank")
      .withColumn("accountIDStr", col("accountID").cast(StringType))
      .withColumn("lengthaccid",length(col("accountIDStr")))
x.groupBy("accountID").count.filter(col("count").gt(1)).show
  x.groupBy("eventType").count.show
  x.groupBy("customerType").count.show
  x.groupBy("ZonePlan").count.show
  x.groupBy("lengthaccid").count.show
 // x.groupBy("ZoneName").count.show

  x.show()
//x.columns.foreach(println)


  val verificationResult = VerificationSuite()
    .onData(x)
    .addCheck(
      Check(CheckLevel.Error, "unit testing my data")
        .isComplete("_id")
        .isComplete("eventType")
        .isComplete("timestamp")
        .isComplete("accountID")
        .isComplete("customerType")
        .isComplete("autoPct")
        .isComplete("avgAutoPct")
        .isComplete("diff")
        .isComplete("zoneID")
        .isComplete("zoneName")
        .isComplete("zonePlan")
        .isComplete("zoneRank")
       // .isUnique("_id")
      //  .isUnique("eventType")
        .isUnique("timestamp")
        .isUnique("accountID")
      //  .isUnique("customerType")
      //  .isUnique("autoPct")
      //  .isUnique("avgAutoPct")
      //  .isUnique("diff")
      //  .isUnique("zoneID")
      //  .isUnique("zoneName")
      //  .isUnique("zonePlan")
      //  .isUnique("zoneRank")
        .hasMax("autoPct",_ < 45.0)
        .isContainedIn("eventType", Array("Bot Events"))
        .isContainedIn("customerType", Array("paygo","contract"))
        .isContainedIn("zonePlan", Array("PRO","ENT","FREE","BIZ"))
        .hasPattern("zoneName",new Regex("."))
        .hasMaxLength("accountIDStr", _ <= 7)
        .isNonNegative("zoneID")


      //Check ranges on event type and customer Type, zonePlan
  //Check if zone name is URL
      //"autoPct",_ > 45.0
      //avgAutoPct _ > 15.0
      //Format of Timestamp
      //






    )
    .run()


       /**
        .hasSize(_ == 5) // we expect 5 rows
        .isComplete("id") // should never be NULL
        .isUnique("id") // should not contain duplicates
        .isComplete("productName") // should never be NULL
        // should only contain the values "high" and "low"
        .isContainedIn("priority", Array("high", "low"))
        .isNonNegative("numViews") // should not contain negative values
        // at least half of the descriptions should contain a url
        .containsURL("description", _ >= 0.5)
        // half of the items should have less than 10 views
        .hasApproxQuantile("numViews", 0.5, _ <= 10))
**/


  if (verificationResult.status == CheckStatus.Success) {
    println("The data passed the test, everything is fine!")
  } else {
    println("We found errors in the data:\n")

    val resultsForAllConstraints = verificationResult.checkResults
      .flatMap { case (_, checkResult) => checkResult.constraintResults }

    resultsForAllConstraints
      .filter { _.status != ConstraintStatus.Success }
      .foreach { result => println(s"${result.constraint}: ${result.message.get}") }

    val DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss"

    /**
    def validateDf(row: Row): Boolean = try {
      //assume row.getString(1) with give Datetime string
      java.time.LocalDateTime.parse(row.getString(1), java.time.format.DateTimeFormatter.ofPattern(DATE_TIME_FORMAT))
      true
    } catch {
      case ex: java.time.format.DateTimeParseException => {
        // Handle exception if you want
        false
      }
    }


 **/
  }



  //x.write.csv("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\tenantCSV")

//parfile.select("_aepgdcdevenablement2").printSchema()
//val parexp = parfile.withColumn("_tenant",explode(col("_aepgdcdevenablement2.botEvents")))
 // parexp
  //  .withColumn("zoneInfoEx",
  //    explode(col("_tenant.zoneInfo")))
  //  .select("_tenant.accountID","zoneInfoEx.autoPct").show
}
