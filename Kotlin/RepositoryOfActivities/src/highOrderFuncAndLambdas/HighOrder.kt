package highOrderFuncAndLambdas

fun main() {
    //https://www.geeksforgeeks.org/kotlin-higher-order-functions/

    //One way
    val anonymousFun: (String,String) -> String = {param1,param2 -> "Im am the body $param1 $param2"}
    //Other way
    val anonymousFun2 = {param1 : String, param2:String -> "I'm the body $param1 $param2"}

    //This way we can do different things without creating different funcs
    //like decorators

    makeMyHero("Jorge", "Lambdas", anonymousFun)

    makeMyHero("Jorge2", "Lambadas2", anonymousFun2)


    makeMyHero("Jorge", "Lambdas") { name, heroName -> "We can define also the body directly $name, $heroName"

    }

    // invoke higher-order function
    //Normal funs can also be passed
    higherfunc { a:Int, b:Int -> a*b}
    higherfunc(::add)

    // invoke function and store the returned function into a variable
    val multiply = higherfunc2()
    // invokes the mul() function by passing arguments
    val result = multiply(2,4)
    println("The multiplication of two numbers is: $result")


}

//             parameter,parameter, function or lambda expected
fun makeMyHero(name : String, heroName : String, make: (String, String) -> String){
    val result = make(name,heroName) // we use the local name of the fun
    println(result)
}

fun add(a: Int, b: Int): Int{
    val sum = a + b
    return sum
}
// higher-order function definition
fun higherfunc(addfunc:(Int,Int)-> Int){
    // invoke regular function using local name
    val result = addfunc(3,6)
    print("The sum of two numbers is: $result")
}

//Kotlin program of a function returning another function-

// function declaration
fun mul(a: Int, b: Int): Int{
    return a*b
}
//higher-order function declaration
//does not receive params and returns that fun
fun higherfunc2() : ((Int,Int)-> Int){
    return ::mul
}


