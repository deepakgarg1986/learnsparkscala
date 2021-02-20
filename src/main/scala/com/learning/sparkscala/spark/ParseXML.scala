package com.learning.sparkscala.spark
import com.databricks.spark.xml._
import org.apache.spark.sql.SparkSession

object ParseXML  extends App{

  val spark = SparkSession.builder
    .appName("DataframeDataset")
    .config("spark.master", "local")
    .getOrCreate()
   spark.sparkContext.setLogLevel("WARN")
  val df = spark.read
    .option("rowTag", "book")
    .xml("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\books.xml")

  df.select("author","title").show(20,false)

}
