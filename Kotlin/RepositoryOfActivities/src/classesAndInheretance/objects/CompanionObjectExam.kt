package classesAndInheretance.objects

//kotlin does not have static keyword so our static would be topLevel declarations
var likeThis = 20

//and companion objects

fun main() {
    //this way we kind of implement an abstract method or propery
    val anotherThing = SomeClass.accessPrivateVar()

    val one = SomeClass()
    println(SomeClass.accessPrivateVar())
    val two = SomeClass()
    println(SomeClass.accessPrivateVar()) // the static value adds without problem
}

class SomeClass(){

    // to simulate static

    init {
        somePrivateValueStatic++
    }
    companion object{
        private var somePrivateValueStatic = 6

        fun accessPrivateVar(){
            println("Here it is $somePrivateValueStatic")
        }
    }
}