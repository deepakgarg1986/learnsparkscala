package com.learning.sparkscala.collections
import scala.Array._
object learnArrayMore extends App {

  // Removing duplicate elements from the array using distinct
  val empName = Array("Sharon", "John", "Sharon", "Leon", "John")

  // Print all the array elements
  println("Employee Salary:")

  var empSalary = Array(5000, 2500, 2000, 3400)
  var maxSal = empSalary(0);
  for (i <- 1 to (empSalary.length - 1)) {
    if (empSalary(i) > maxSal) maxSal = empSalary(i);
  }
  println("Max Salary is: " + maxSal);

  for (sal <- empSalary) {
    println(sal)
  }
  val empDistinct = empName.distinct
  var totalSalary = 0;
  for (i <- 0 to (empSalary.length - 1)) {
    totalSalary += empSalary(i);
  }
  println("Total Salary is: " + totalSalary);

  //Using Range in Arrays
  // Summing all elements

  // Finding the largest element

  var empHike1 = range(10, 20, 2)
  var empHike2 = range(10, 20)
  // Print all the array elements
  println("Range values for Employee Hike List1: ")
  for (employeeHike <- empHike1) {
    print(" " + employeeHike)
  }
  println()
  println("Range values for Employee Hike List2: ")
  for (employeeHike <- empHike2) {
    print(" " + employeeHike)
  }
  println()

  //Multi-dimensional Arrays
  println("Employee Matrix")
/**
  for (row <- 0 to 2) {
    for (col <- 0 to 2) {
      employeeMatrix(row)(col) = col + seatNo;
    }
    seatNo = seatNo + 5
  }
  for (row <- 0 to 2) {
    for (col <- 0 to 2) {
      print(" " + employeeMatrix(row)(col));
    }
    println();
  }
  var seatNo = 1001
  var employeeMatrix = ofDim[Int](3, 3)
  println("Finding Distinct Employee Name:")
  for (uniqueName <- empDistinct)
    println(uniqueName)
  **/
}
