package dataTypeAndNullProtection.arrays

fun main() {
    val names = arrayOf("Jorge", "Juan","Sofia")

    val ages = arrayOf<Int>(1,2,3,4,5) // redundant

    val numbers = Array(16){i -> i*2}

    val mixedArray = arrayOf("Hola",5,'a',25.4)

    val arrayOfOnlyInts = intArrayOf(1,5,2,3)

    val primitiveArray = IntArray(5) //everything set to zero but 5 available spaces

    names.forEach {
        println(it)
    }

    println(ages[2])

    numbers.forEach {
        println(it)
    }

    // way without lambdas
    for (element in mixedArray){
        println(element)
    }

    //.toIntArray transforms the array into an array of Int


}