package com.learning.sparkscala.UserDefinedFunctions

import org.apache.spark.sql.functions.udf

object SparkUtils {

  def cTof (degcel:Double): Double = {
    (degcel * 9.0/5.0) + 32
  }

  val cTofudf = udf[Double,Double](cTof)
}
