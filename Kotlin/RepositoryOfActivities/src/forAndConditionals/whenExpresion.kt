package forAndConditionals

import classesAndInheretance.sealedClases.Animals

fun main() {

    //Basically a superSwitch
    //Has ranges, smart casts and a lot

    val number = 5

    var result = when(number) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        in 4..10 -> "Number too high, but acceptable"
        !in 100..Int.MAX_VALUE -> "Number too high, but solvable"
        else -> "Number too high"
    }

}

fun checkType(myParameter : Animals){
    when(myParameter){
        is Animals.Dog ->
            println(myParameter.display())
        is Animals.Cat ->
            println("Soy un gato we")
        is Animals.anotherThing ->
            println("Sepa que soy jajaj")
    }
}