package highOrderFuncAndLambdas

val numbers = arrayOf(1,-2,3,-4,5)

//We also have functions withoutName that can be called
// anonymous function with body as a block
val anonymous2Mul = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}

fun main(args: Array<String>) {

    //https://www.geeksforgeeks.org/kotlin-lambdas-expressions-and-anonymous-functions/?ref=rp

    //LAMBDAS STRUCTURE
    // define the anonymous method, then the parameters, what it returns
    // and inside the "{}" we define the body
    //One way
    val anonymousFun: (String,String) -> String = {param1,param2 -> "Im am the body $param1 $param2"}
    //Other way
    val anonymousFun2 = {param1 : String, param2:String -> "I'm the body $param1 $param2"}

    println(anonymousFun("GEGE","gagaga"))
    println(anonymousFun2("GEGE","gagaga"))

    //We have an implicit lambda
    println(numbers.filter {item -> item > 0 })

    // We can also use it like Class extension
    val lambda4 : String.(Int) -> String = { this + it }
    //this in this case is the original INT, it is the parameter received
    val sumIsPair : Int.(Int) -> Boolean = {(this + it)%2 == 0 }

    println("Jorge prueba".lambda4(50))
    println(sumIsPair(8,8))

    println(anonymous2Mul(4,8))


}

