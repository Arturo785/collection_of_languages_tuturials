package forAndConditionals

import java.util.*
import kotlin.collections.HashMap

//list are kind of like python lists
// they are mutable and not mutable lists

// all the collection https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/

// api https://www.baeldung.com/kotlin-collections-api

/*important functions
map
filter
groupBy
any
count
sortedMap
removeIf
sortedBy*/


fun main() {

    mapUsageWithCASA("casa")

    //we can print a map or a pair like in python

    // for ((k,v) in myMap){
        // do stuff
    //}

    //Unpacking a car Object
    val myCar = CarUnpacking("Green","Toyota",1998)

    val (color,model,year) = myCar
    println(color)
    println(model)
    println(year)

    val myStack = Stack<Int>()

    myStack.push(4)
    println(myStack.peek())
    myStack.pop()

    val ints = arrayOf(1,5,8,8,5)

    // map is like python, that takes each element and transforms it into whatever we want
    // we can use it to extract specific info from an object and stuff
    val myGeneratedMap = ints.map { it*10 }
    println(myGeneratedMap)

    //filter + map can be used

    //group by also exists
    
    //in case we have normal class (not data class) we must use
    //operator fun component1() = color
    //operator fun component2() = model
    //operator fun component3() = year
}

fun mapUsageWithCASA(word : String){
    val repeated = HashMap<Char,Int>()

    word.forEach {
        if (repeated.containsKey(it)){
            repeated[it] = repeated[it]!!.plus(1)
        }
        else{
            repeated[it] = 1
        }
    }

    // like tuple unpacking, also works with pairs
    repeated.forEach{ (key, value) -> println("KEY:$key times:$value")}
}

data class CarUnpacking(val color: String, val model : String, val year : Int) {


}
