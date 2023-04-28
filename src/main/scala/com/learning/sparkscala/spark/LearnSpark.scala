package com.learning.sparkscala.spark
import org.apache.spark.sql.SparkSession
object LearnSpark  extends App{

  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()
  spark.sparkContext.setLogLevel("WARN")


  val a = spark.sparkContext.parallelize (Array("jan","feb","march","april","may")).map(x=> (x.length,x))
  val b = spark.sparkContext.parallelize (Array((3,"three letter word"),(4,"four letter word")))
  val c = a.join(b)
  a.collect().foreach(println)
  b.collect().foreach(println)
  c.collect().foreach(println)
  val d = a.leftOuterJoin(b)
  d.collect().foreach(println)
  /**
  println("Mean " + x.mean)
  println("Sum " + x.sum)
  println("Variance" + x.variance)
  println("Stats" + x.stats)
**/
}
