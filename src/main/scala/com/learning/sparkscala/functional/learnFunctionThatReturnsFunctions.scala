package com.learning.sparkscala.functional

object learnFunctionThatReturnsFunctions extends App {

 //Higher Order Function That returns Function
  def urlBuilder(ssl: Boolean, domainName:String) : (String,String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint:String, query:String) => s"$schema$domainName/$endpoint?$query" }

  val domainName = "www.example.com"

  val endpoint = "users"
  val query = "id=1"
  def getURL = urlBuilder(ssl=true,domainName)
  val url = getURL(endpoint,query)
  println(url)

}
