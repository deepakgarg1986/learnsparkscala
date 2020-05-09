package com.learning.sparkscala.collections
import scala.collection.mutable.ArrayBuffer

object learnArrayBuffer {
def main(args: Array[String]): Unit = {
  /** How to create an ArrayBuffer**/
  /**ArrayBuffer with values*/
  //val intArrayBuffer:ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
  //val stringArrayBuffer:ArrayBuffer[String] = ArrayBuffer("a","b","c")
  /**ArrayBuffer without values*/
  var intArrayBufferWV = new ArrayBuffer[Int]
  intArrayBufferWV  += 23
  intArrayBufferWV  += (2,3,5)
  intArrayBufferWV  ++= Array(6,7,8)
  /** What differ types of ArrayBuffer can be created*/


  /** What we can do with ArrayBuffer **/
  //intArrayBuffer(2) = 10

  /** What we cannot do with ArrayBuffer **/
  /** We can not change the size of ArrayBuffer*/
  //intArrayBuffer(4) = 12
  /** We cannot change the data type once it is declared*/

  // intArrayBuffer(3) = "ram"
  /** how to print an ArrayBuffer*/
  //intArrayBuffer.foreach(println)
  intArrayBufferWV.foreach(println)
}
}
