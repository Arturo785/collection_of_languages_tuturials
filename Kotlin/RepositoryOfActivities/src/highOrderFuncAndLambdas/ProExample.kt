package highOrderFuncAndLambdas

//https://agrawalsuneet.github.io/blogs/higher-order-functions-in-kotlin/

// fun willBePart and can be called from any arrayList instance
// receives a fun that receives a T type and returns the boolean
fun <T> ArrayList<T>.myOwnFilterOnCondition(condition : (T) -> Boolean) : ArrayList<T>{
    val result = ArrayList<T>()
    for(item in this){
        if (condition(item)){
            result.add(item)
        }
    }
    return result
}

fun main() {
    val myListToFilter = arrayListOf<String>("Jorge","Koke", "lolo","goro")
    val myListToFilter2 = arrayListOf<Int>(1,5,8,6,2,1,4,7)

    val ownLambdaFun = {param1 : String, param2: String -> param1 == param2}

    println(myListToFilter.myOwnFilterOnCondition { it.contains("e") }) //contains returns a boolean so its ok
    println(myListToFilter2.myOwnFilterOnCondition { isMultipleOf(it,2) })
    println(myListToFilter.myOwnFilterOnCondition { it[0].isUpperCase()}) // isUpperCase returns a boolean so its ok
    println(myListToFilter.myOwnFilterOnCondition { ownLambdaFun(it,"goro") })

}

fun isMultipleOf (number: Int, multipleOf : Int): Boolean{
    return number % multipleOf == 0
}