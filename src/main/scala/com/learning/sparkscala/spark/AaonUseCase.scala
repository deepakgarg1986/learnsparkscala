package com.learning.sparkscala.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{year,month,round,col,avg}

object AaonUseCase  extends App{

  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

  val aaon = spark.read.option("header",true).option("inferSchema",true).csv("/user/deepakpec281edu/StockData/AAON.csv")
  val aaonDF = aaon
    .withColumn("Year", year(col("Date")))
    .withColumn("Month",month(col("Date")))
    .groupBy("Year","Month")
    .agg(round(avg(col("Adj Close")),2)
      .as("AvgAdjClsPrice"))
    .orderBy(col("Year").desc, col("Month").desc)
  aaonDF.coalesce(2).write.json("/user/deepakpec281edu/outputjson/")


}
