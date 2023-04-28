package com.learning.sparkscala.DataProfiling.Workday

import org.apache.spark.sql.SparkSession

object SelectColumns extends App {


  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()

  spark.sparkContext.setLogLevel(("WARN"))


  //Selected columns on which analysis needs to be performed
  val oppurtunitysample = spark.read.option("header",true).option("inferSchema",true)
    .csv("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Workday\\SampleFiles\\opportunitySelectedColumns.csv")

  val colu =oppurtunitysample.columns
      colu.foreach(println)


  val oppurtunity = spark.read.option("header",true).option("inferSchema",true)
    .csv("file:///C:\\Users\\deepak.garg\\Desktop\\Adbe\\Projects\\Workday\\DataProfiling\\Opportunity.csv")
    .select(colu.head,colu.tail: _*)


  println(oppurtunity.count)
  oppurtunity.show
  oppurtunity.printSchema()





}
