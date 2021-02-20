package com.learning.sparkscala.spark
import org.apache.spark.sql.SparkSession
object ReadCompressedFile  extends App {

  val spark = SparkSession.builder
    .appName("DataframeDataset")
    .config("spark.master", "local")
    .getOrCreate()
  spark.sparkContext.setLogLevel("WARN")


  val compress = spark.read.option("header",true).csv("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\AAON.csv.gz")

  compress.show
}
