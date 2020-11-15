package com.learning.sparkscala.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{date_format,col}

object AaonUseCase  extends App{

  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

  val AAONDF = spark.read.option("header",true).csv("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\AAON.csv")
AAONDF.withColumn("month", date_format(col("Date"),"yyyy-MM")).show

}
