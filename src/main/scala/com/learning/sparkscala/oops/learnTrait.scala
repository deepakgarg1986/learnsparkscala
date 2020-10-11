package com.learning.sparkscala.oops

//Unlike a class inherits only one super class, a class can inherit any number of traits//
//Scala allow traits to be partially implemented //


trait learnTrait  {
  def hasNext:Boolean
  def next():Int
}
/**
class IntIterator (to: Int) extends learnTrait {
  private var current = 0
  override def hasNext:Boolean = current < to
  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0 }

}

/** Can trait have contructors*/
val iterator = new IntIterator(10)
iterator.next()
iterator.next()

*/