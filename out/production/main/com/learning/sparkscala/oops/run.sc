object learnSingletonObject {
  private var lastNum = 0
  def newReservation() =  {lastNum +=1 ; lastNum}

}
learnSingletonObject.newReservation()

learnSingletonObject.newReservation()

learnSingletonObject.newReservation()

learnSingletonObject.newReservation()