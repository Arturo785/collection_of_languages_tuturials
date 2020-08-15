package classesAndInheretance.objects

/*
* can also be used to create objects of an anonymous class known as anonymous objects.
*  They are used if you need to create an object of a slight modification of some class
*  or interface without declaring a subclass for it.
* */
//and are disponsable, they are not singletons

open class Person() {
    fun eat() = println("Eating food.")

    fun talk() = println("Talking with people.")

    open fun pray() = println("Praying god.")
}

interface myInterface{
    fun overrideMe()
}

fun main(args: Array<String>) {

    val atheist = object : Person() {
        override fun pray() = println("I don't pray. I am an atheist.")
    }

    val myOverride = object : myInterface{
        override fun overrideMe() {
            println("Im am anonymous class")
        }
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()

    myOverride.overrideMe()
}