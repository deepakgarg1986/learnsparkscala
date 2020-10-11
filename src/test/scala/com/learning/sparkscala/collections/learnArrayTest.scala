package com.learning.sparkscala.collections

import org.junit.Test
//import com.learning.sparkscala.collections.learnArray
import org.junit.Assert

class learnArrayTest {

  @Test
  def testArray(): Unit = {

    val result = learnArray.createArray()
val len = result.length
//println(len)
    Assert.assertTrue( len== 5)
  }
}
