package Generics

fun main() {
    val nums = mutableListOf(1,5,8,4)
    val numsDouble = mutableListOf<Double>(1.6,5.4,8.44,4.0)
    val names = mutableListOf("jsjsj", "asanksmk","mllsdsdsd")

    printTheContent(nums)
    printTheContent(names)
    printTheContentOnltInts(numsDouble)
}



// that is how we declare in
fun <T> printTheContent(collection : List<T>){
    collection.forEach{
        println("The element inside is: $it")
    }
}

// to limit the amount of generic things that receives
fun <T : Number> printTheContentOnltInts(collection : List<T>){
    collection.forEach{
        println("The element inside is: ${it.toInt()}")
    }
}

inline fun <reified T> getElementsOfType(listPassed: List<Any>) : List<T>{
    val newList = mutableListOf<T>()
    for (element in listPassed){
        if (element is T){
            newList.add(element)
        }
    }
    return newList
}