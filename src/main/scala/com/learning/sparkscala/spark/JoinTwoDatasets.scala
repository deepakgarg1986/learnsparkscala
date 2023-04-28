package com.learning.sparkscala.spark


import org.apache.spark.sql.SparkSession
object JoinTwoDatasets extends App {
  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")
  //val parquetFile = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\sampledata\\*.parquet")
  val df1 = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\IngestMultipleReceondUsing SingleFile\\FindBatch")
  val df2 = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\IngestMultipleReceondUsing SingleFile\\FindBatch")

  //Here i am joining df1 column with df2 column
  //Both these dataframes has Id columns
  //Join is done on Column Id
  //I can add more columns in Seq if needed
  val df3 = df1.join(df2, Seq("Id"))
 // println(parquetFile.count())
 // parquetFile.select("personKey.sourceKey").show(3,false)
   df3.write.json("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\tenantJson")
  /*
   parquetFile
     .withColumnRenamed("_cloudflareinc","_aepgdcdevenablement2")
     .write
     .parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\tenantSample")
   */
  //println(parquetFile.count())
  //parquetFile.show()
}
