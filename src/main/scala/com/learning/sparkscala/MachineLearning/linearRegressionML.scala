package com.learning.sparkscala.MachineLearning

import org.apache.spark.sql.SparkSession

import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types._
import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.ml.feature.VectorAssembler
//import org.apache.spark.mllib.linalg.Vector
//import org.apache.spark.ml.linalg.Vector

object linearRegressionML extends App {

  val spark = SparkSession.builder
    .appName("LinearRegression")
    .config("spark.master", "local")
    .getOrCreate()
     spark.sparkContext.setLogLevel("ERROR")
 val ecommDF = spark.read.option("header", "true").option("inferSchema", "true").format("csv")
    .load("file:///C:\\Users\\sapnag\\Desktop\\Edureka\\ml\\EcommerceCustomers.csv")

 // val ecommDF = spark.read.option("header", "true").option("inferSchema", "true").format("csv")
   // .load("/user/edureka_967855/machinelearning/linearregression/EcommerceCustomers.csv")


  val ecommDF1 = ecommDF
          .withColumn("label", col("Yearly Amount Spent").cast(IntegerType))
          .withColumn("AvgSessionLength", col("Avg Session Length").cast(IntegerType))
          .withColumn("TimeonApp", col("Time on App").cast(IntegerType))
          .withColumn("TimeonWebsite", col("Time on Website").cast(IntegerType))
          .withColumn("LengthofMembership", col("Length of Membership").cast(IntegerType))
          .drop("Email", "Address", "Avatar", "Avg Session Length", "Time on App",
                        "Time on Website", "Length of Membership", "Yearly Amount Spent")


  val assembler = new VectorAssembler().setInputCols(Array("AvgSessionLength","TimeonApp","TimeonWebsite","LengthofMembership")).setOutputCol("features")
  val ecommDF2 = assembler.transform(ecommDF1).select(col("label"),col("features"))

  ecommDF2.show

  val lr = new LinearRegression()

  val lrModel = lr.fit(ecommDF2)
  println(s"Coefficients: ${lrModel.coefficients} Intercept: ${lrModel.intercept}")

  val trainingSummary = lrModel.summary
  trainingSummary.residuals.show()

  trainingSummary.residuals.orderBy("residuals").show



}
