package forAndConditionals

import java.util.*

fun main() {

    println(countToValueGiven(20))

    val listOfEmplo = listOf(lambdaTest("Jorge","Rodriguez",20),
            lambdaTest("Juanito", "gege", 20),
            lambdaTest("pepe", "lolo",20)
            )

    val searchEmployee = listOfEmplo.filter { it.lastName == "loo" }

    val myQueue  = LinkedList<Int>()
    myQueue.add(5)
    println(myQueue.peek())
    println(searchEmployee)
}

//With keyword is an automatic return and we can add things to the object or stuff that has the brackets

fun countToValueGiven(value : Int) =
        with(StringBuilder()){
            for (i in 0..value){
                this.append(i)
                this.append(",")
            }
            this.deleteCharAt(this.lastIndex)
            toString()
        }


data class lambdaTest(val name : String, val lastName : String, val age : Int)