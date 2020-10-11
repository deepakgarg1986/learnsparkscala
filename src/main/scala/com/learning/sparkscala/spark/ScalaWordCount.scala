package com.learning.sparkscala.spark

//import org.apache.spark.SparkConf
//import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object ScalaWordCount {

  def main(args: Array[String]){


   // val sparkConf = new SparkConf()
   // val sc = new SparkContext(sparkConf)

    val spark = SparkSession.builder.getOrCreate()

    val logFile = "file:\\\\C:\\Users\\sapnag\\Desktop\\Edureka"
    val file = spark.sparkContext.textFile(logFile)
    val counts = file.flatMap(_.split(" ")).map(x => (x,1)).reduceByKey(_+_)
counts.collect()

   // counts.saveAsTextFile("hdfs://nameservice1/user/edureka_967855/SparkScala1/output")
  }
}