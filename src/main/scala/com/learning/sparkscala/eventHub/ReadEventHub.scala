package com.learning.sparkscala.eventHub
import org.apache.spark.eventhubs._
import com.microsoft.azure.eventhubs._
import org.apache.spark.sql.SparkSession

object ReadEventHub extends App {

  val namespaceName = "dev-idp-27531-pega-ehub"
  val eventHubName = "com-att-idp-p13n-clickstream-event"
  val sasKeyName = "RootManageSharedAccessKey"
  val sasKey = "9yi+mQaJPDu21EYIFWU9Y0/C8Hbo4TMtemBoqiFQcII="
  val connStr = new com.microsoft.azure.eventhubs.ConnectionStringBuilder()
    .setNamespaceName(namespaceName)
    .setEventHubName(eventHubName)
    .setSasKeyName(sasKeyName)
    .setSasKey(sasKey)


  val spark = SparkSession.builder
    .appName("ReadMultilineJson")
    .config("spark.master", "local")
    .getOrCreate()
  val customEventhubParameters =
    EventHubsConf(connStr.toString())
      .setMaxEventsPerTrigger(5)

  val incomingStream = spark.readStream.format("eventhubs").options(customEventhubParameters.toMap).load()

  incomingStream.printSchema
  //incomingStream.show(10)
 // incomingStream.writeStream.start()
  // Sending the incoming stream into the console.
  // Data comes in batches!
  incomingStream.writeStream.outputMode("append").format("console").option("truncate", false).start().awaitTermination()

}
