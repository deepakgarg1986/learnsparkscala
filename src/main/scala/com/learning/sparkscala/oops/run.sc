class Employee {
  import Employee.empid
  private var empid: Int = 0
  var empname: String = ""
  def this(empid: Int, empname: String) {
    this()
    Employee.empid+=1
    this.empid =Employee.empid
    this.empname = empname
    println("Employee has been created with the employee ID "+this.empid)
  }
}
object Employee{
  var empid = 100000
}

    var emp = new Employee(799,"Rahul")
