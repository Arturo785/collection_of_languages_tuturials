package `1stPractice`

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Referencial comparision ${hello1 === hello2}")
    println("Content comparision ${hello1 == hello2}")

    var num = 2988
    num = 2020

    val myAny : Any = "The any type" //Like object in java

    if (myAny is String){
        println(myAny.toUpperCase())
    }

    val identedString = """   1
                          *  11
                          * 111
                          *1111
    """.trimMargin("*")

    println(identedString)


}