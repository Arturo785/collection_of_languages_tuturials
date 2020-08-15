package forAndConditionals

// Basically .map, .filter etc creates and allocates a collection everyTime is used
// that means that things like this
// myList.map{anyAction}.map{everyAction}.filter{everyAction}.etc
// allocates a list every function that passes

// there is when asSequence enters and uses all that lists in sequence and does not allocates them
// and returns a sequence or the final list if we want .toList()

//https://www.youtube.com/watch?v=_F4ZzK2Iquc

// may be a little slower but does not waste memory

fun main() {

    val myList = createList(20)

/*    println(myList.filter { it % 2 ==0 }
            .map { it*10 }
            .filter { it > 100 }
            .map { it-5 })*/

    //This works element by element so if an element does not pass goes to the other one
    println(myList.asSequence()
            .filter { println("Filtering as S $it");it % 2 ==0 }
            .map {println("mapping as S $it"); it*10 }
            .filter {println("Filtering as S $it"); it > 100 }
            .map {println("mapping as S $it"); it-5 }
            .toList())


    //This way first does all the filter, then all the map, then all the filter again, then all the map again
    println(myList
            .filter { println("Filtering $it");it % 2 ==0 }
            .map {println("mapping $it"); it*10 }
            .filter {println("Filtering $it"); it > 100 }
            .map {println("mapping $it"); it-5 })


}

fun createList(range : Int) : List<Int>{
    val returnList = mutableListOf<Int>()
    for (i in 0..range){
        returnList.add((1..100).random())
    }
    return returnList
}

fun printTheNum(num : Int){
    println("This number passed the filters $num")
}