object learnSingletonObject  {
  private var lastNum = 0
  def newReservation() =  {lastNum +=1 ; lastNum}

}

//user 1
learnSingletonObject.newReservation

//user 2
learnSingletonObject.newReservation