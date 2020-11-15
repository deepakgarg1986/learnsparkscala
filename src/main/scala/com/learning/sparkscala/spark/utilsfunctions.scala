package com.learning.sparkscala.spark
import org.apache.spark.sql.functions.udf

object utilsfunctions {

  val a = udf((degCel:Double) => ((degCel * 9.0/5.0) + 32))
  //spark.udf.register("CTOF",(degCel:Double) => ((degCel * 9.0/5.0) + 32))

}
