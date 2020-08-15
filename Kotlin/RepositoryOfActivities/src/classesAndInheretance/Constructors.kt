package classesAndInheretance

fun main() {

    var employeTest = EmployeWithEmpty2()
    println(employeTest.age)
}

//With primary constructor
class Employe(val name : String, var age : Int = 0){

}

//second way
class Employe2 constructor(val name : String, var age : Int = 0){


}

// with secondary constructor
class Employe3(val name : String, var age : Int = 0){
    var fullTime = true

    constructor(name : String, age: Int, fullTime : Boolean) : this(name,age){
        this.fullTime = fullTime
    }

}

class EmployeWithEmpty{
    var name :String = ""
    var age : Int = 0
    var fullTime : Boolean = true

    constructor(name : String, age: Int,  fullTime : Boolean){
        this.name = name
        this.age = age
        this.fullTime = fullTime
    }

    constructor()
}

class EmployeWithEmpty2 (var name : String = "", var age: Int = 0,  val fullTime : Boolean = true){


}

