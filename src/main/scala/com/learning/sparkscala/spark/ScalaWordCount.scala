package com.learning.sparkscala.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
//import org.apache.spark.sql.SparkSession

object ScalaWordCount {

  def main(args: Array[String]) {


     val sparkConf = new SparkConf().setAppName("SampleApp").setMaster("local")
     val sc = new SparkContext(sparkConf)

    //val spark = SparkSession.builder
    //  .appName("Sample App")
    //  .config("spark.master", "local")
    //  .getOrCreate()

  val logFile = "file:///C:\\Users\\deepak.garg\\Desktop\\Edu\\samplefile.txt"
   //val logFile = "hdfs://nameservice1/user/deepakpec295edu/samplefiles/txt/sample.txt"

    //val file = sc.textFile(logFile)
  //file.collect.foreach(println)



    //RDD

    val file = sc.textFile(logFile)
   // val certainwords = file.filter(x => x.contains("this"))
    //certainwords.collect().foreach(println)
   // val file = spark.sparkContext.textFile(logFile)
    val counts = file.flatMap(_.split(" ")).map(x => (x, 1)).reduceByKey(_ + _).sortByKey(true)


    //counts.collect().foreach(println)
    counts.saveAsTextFile("hdfs://nameservice1/user/deepakpec295edu/SparkScala")
     //counts.saveAsTextFile("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\output")
  }
}