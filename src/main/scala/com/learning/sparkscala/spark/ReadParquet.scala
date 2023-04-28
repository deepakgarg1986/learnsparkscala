package com.learning.sparkscala.spark


import org.apache.spark.sql.SparkSession
object ReadParquet extends App {
  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

spark.sparkContext.setLogLevel("WARN")
  //val parquetFile = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\sampledata\\*.parquet")
  val parquetFile = spark.read.parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\IngestMultipleReceondUsing SingleFile\\FindBatch")


  println(parquetFile.count())
  parquetFile.select("personKey.sourceKey").show(3,false)
 // parquetFile.write.json("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\tenantJson")
 /*
  parquetFile
    .withColumnRenamed("_cloudflareinc","_aepgdcdevenablement2")
    .write
    .parquet("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\dataprofiling\\tenantSample")
  */
  //println(parquetFile.count())
  //parquetFile.show()
}
