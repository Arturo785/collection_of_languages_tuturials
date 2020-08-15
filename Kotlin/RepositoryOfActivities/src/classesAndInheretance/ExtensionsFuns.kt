package classesAndInheretance


fun main() {
    val randomStr = "hello everybody"

    println(randomStr.upperFirstAndLast())// every string instance can use this method

    justReceivesAfun { 4*5 } // receives a lambda as a parameter

}


//This way the fun acts as if belongs to the original String class and every string can use it
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

fun justReceivesAfun(myFun :(num : Int) -> Int){
    println("Normal fun")
    println(myFun(5))
    println("continues my fun")
}

fun funAsArgument(num : Int) = num*num
