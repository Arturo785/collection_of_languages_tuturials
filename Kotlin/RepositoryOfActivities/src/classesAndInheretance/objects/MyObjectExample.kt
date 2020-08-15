package classesAndInheretance.objects

import java.time.Year

fun main() {

    val test = MyObjectExample.currentYear // the instance is created whenever we use the class for first time
    //val testInstance = MyObjectExample() // can not be instantiated
    println(test)
}


// object means that will only be one instance of the object means is a singleton
object MyObjectExample {

    val currentYear = Year.now().value

    fun getTagLine() = "My own message"

    fun getCopyrightLine() = "Company $currentYear. All rights reserved"


}