package forAndConditionals

import java.lang.Exception


// besides old try catch we can use it like an expression
fun main() {

    println(getNumber("a")?: "A number was not introduced")
    println(getNumber("8"))


}

// We return normal if everything ok otherwise return our own value
fun getNumber(string: String): Int?{
   return try {
        Integer.parseInt(string)
    }
   catch (e : Exception){
       -1
       //or
       null
   }
    finally {
        println("Done")
    }
}