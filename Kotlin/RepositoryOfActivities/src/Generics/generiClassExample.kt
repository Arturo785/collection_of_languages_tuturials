package Generics

class MyGeneric<T>(var value : T){

    override fun toString(): String {
        return "The value inside is: $value"
    }
}

fun main() {
    val myInstance = MyGeneric<Int>(6)
    val myInstance2 = MyGeneric<String>("Hola")

    println(myInstance)
    println(myInstance2)
}