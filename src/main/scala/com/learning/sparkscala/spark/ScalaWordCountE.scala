package com.learning.sparkscala.spark

import org.apache.spark.sql.SparkSession


object ScalaWordCountE {
  def main(args: Array[String]) {


    //val sparkConf = new SparkConf().setAppName("SampleApp").setMaster("local")
    //val sc = new SparkContext(sparkConf)

    val spark = SparkSession.builder
     .appName("Sample App")
     .config("spark.master", "local")
     .getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    // val logFile = "file:///C:\\Users\\sapnag\\Desktop\\Edureka\\sampletextfile.txt"
    val logFile = "hdfs://nameservice1/user/edureka_967855/SparkScala/input/samplefile.txt"

    //RDD
    val file = spark.sparkContext.textFile(logFile)
    val counts = file.flatMap(_.split(" ")).map(x => (x, 1)).reduceByKey(_ + _)
    counts.collect().foreach(println)


  }
}
