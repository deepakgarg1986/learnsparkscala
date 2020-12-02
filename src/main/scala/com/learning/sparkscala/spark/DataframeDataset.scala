package com.learning.sparkscala.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col


object DataframeDataset extends App{

  val spark = SparkSession.builder
    .appName("DataframeDataset")
    .config("spark.master", "local")
    .getOrCreate()



  import spark.implicits._
  case class employee (name:String, age:Long)

  val dataframeex = spark.read
    .json("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\employee.json")

  val dataframeex1 = dataframeex.select("name")

  val datasetex = spark.read
    .json("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\employee.json").toDF().as[employee]

  val datasetex1 = datasetex.select("names")

  case class Person(name: String, age: Int)

  val personDS = Seq(Person("Max", 33), Person("Adam", 32), Person("Muller", 62)).toDS()
  personDS.select("names").show()

}
