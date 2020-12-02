package com.learning.sparkscala.spark
import org.apache.spark.sql.SparkSession

object ReadMultilineJson  extends App{

  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()



  val multilineJson = spark.read.option("multiline",true).
    json("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\multiline.json")


  multilineJson.show
}
