package com.learning.sparkscala.spark

import org.apache.spark.sql.SparkSession

object ReadJson  extends App{

  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  val multilineJson = spark.read.option("multiline",true).
    json("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\WorldVisionCanada\\Samplefiles\\Shopify-Order-Full-payload.json")
  multilineJson.printSchema()
  //multilineJson.columns.foreach(println)
  //println(multilineJson.count())
  //multilineJson.write.mode("overwrite").json("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Cloudfare\\AccountsSampleData\\singleline")
}