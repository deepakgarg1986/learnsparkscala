package com.learning.sparkscala.DataProfiling.Cloudflare

import com.amazon.deequ.VerificationSuite
import com.amazon.deequ.checks.{Check, CheckLevel, CheckStatus}
import com.amazon.deequ.constraints.ConstraintStatus
import org.apache.spark.sql.SparkSession

import scala.util.matching.Regex

object AccountMemberDataset extends App {


  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val parfile = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\botmemberssample")
  // println("Number of records " + parfile.count())
  val x = parfile.select("_cloudflareinc.accountMembers.marketingEligibility",
    "_cloudflareinc.accountMembers.prodUserDeleted",
    "_cloudflareinc.accountMembers.sfContactID",
    "_cloudflareinc.accountMembers.signUpIP",
    "_cloudflareinc.accountMembers.userCreatedDate",
    "_cloudflareinc.accountMembers.userEmail.address",
    "_cloudflareinc.optInsObj.allOptIn",
    "_cloudflareinc.optInsObj.analyticsOptIn",
    "_cloudflareinc.optInsObj.analyticsUpdated",
    "_cloudflareinc.optInsObj.appsOptIn",
    "_cloudflareinc.optInsObj.appsUpdated",
    "_cloudflareinc.optInsObj.blogOptIn",
    "_cloudflareinc.optInsObj.blogUpdated",
    "_cloudflareinc.optInsObj.educationResourceOptIn",
    "_cloudflareinc.optInsObj.educationResourcesUpdated",
    "_cloudflareinc.optInsObj.eventsOptIn",
    "_cloudflareinc.optInsObj.eventsUpdated",
    "_cloudflareinc.optInsObj.feedbackOptIn",
    "_cloudflareinc.optInsObj.feedbackUpdated",
    "_cloudflareinc.optInsObj.productNewPromotionOptIn",
    "_cloudflareinc.optInsObj.productNewPromotionsUpdated",
    "_cloudflareinc.userTag",
    "person.name.firstName",
    "person.name.lastName")
//x.groupBy("userTag").count().orderBy(col("count").desc).show(20,false)
x.groupBy("marketingEligibility").count.show()
  x.groupBy("prodUserDeleted").count.show()
  //x.show
 // x.columns.foreach(println)
  val verificationResult = VerificationSuite()
    .onData(x)
    .addCheck(
      Check(CheckLevel.Error, "unit testing my data")
        .isComplete("marketingEligibility")
        .isComplete("prodUserDeleted")
        .isComplete("sfContactID")
        .isComplete("signUpIP")
        .isComplete("userCreatedDate")
        .isComplete("address")
        .isComplete("allOptIn")
        .isComplete("analyticsOptIn")
        .isComplete("analyticsUpdated")
        .isComplete("appsOptIn")
        .isComplete("appsUpdated")
        .isComplete("blogOptIn")
        .isComplete("blogUpdated")
        .isComplete("educationResourceOptIn")
        .isComplete("educationResourcesUpdated")
        .isComplete("eventsOptIn")
        .isComplete("eventsUpdated")
        .isComplete("feedbackOptIn")
        .isComplete("feedbackUpdated")
        .isComplete("productNewPromotionOptIn")
        .isComplete("productNewPromotionsUpdated")
        .isComplete("userTag")
        .isComplete("firstName")
        .isComplete("lastName")
        .isUnique("userTag")
        .hasPattern("signUpIP",new Regex("."))
       .hasPattern("address",new Regex("@"))
       .isContainedIn("marketingEligibility", Array("true","false"))
        .isContainedIn("prodUserDeleted", Array("true","false"))
    ).run()


  if (verificationResult.status == CheckStatus.Success) {
    println("The data passed the test, everything is fine!")
  } else {
    println("We found errors in the data:\n")

    val resultsForAllConstraints = verificationResult.checkResults
      .flatMap { case (_, checkResult) => checkResult.constraintResults }

    resultsForAllConstraints
      .filter {
        _.status != ConstraintStatus.Success
      }
      .foreach { result => println(s"${result.constraint}: ${result.message.get}") }



    //Flatten Logic


  }
}
