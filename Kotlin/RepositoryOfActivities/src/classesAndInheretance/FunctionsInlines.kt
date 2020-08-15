package classesAndInheretance

fun main() {

    println(returnStr(4,8,"Funcion en una linea"))
    val numbers = intArrayOf(1,5,6,8)
    doSomething(1,5,2,3,6,5)
    doSomething(*numbers)
    println("hola".upperFirstAndLast())

}

fun returnStr(number1 : Int, number2 : Int, message : String) =
        "${number1 + number2} : $message"

fun doSomething(vararg numbers : Int){
    numbers.forEach {
        println(it)
    }
}