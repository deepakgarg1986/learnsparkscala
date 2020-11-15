trait learnTrait  {
  def hasNext:Boolean
  def next():Int  = 5
}
class IntIterator (to: Int) extends learnTrait {
  private var current = 0
   def hasNext:Boolean = current < to
   override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0 }
}
val iterator = new IntIterator(10)
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()
iterator.next()



