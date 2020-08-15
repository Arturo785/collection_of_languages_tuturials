package forAndConditionals

fun main() {

    /*
    Kotlin's loops are similar to Python's. for iterates over anything that is iterable
    (anything that has an iterator()


       Important operators in for
       in
       step
       until down to

       for (num in 0..6 step (2))
       for(num in 20 downTo 2 step (2))

        val intRange = 1..5
        val strRange = "ABD".."XYZ"

        println(2 in intRange)
        println("a" in strRange)

        val seasons = arrayOf("spring", "winter")
        println("example" !in seasons

        seasons.indices  give us the indexes of the array

        forEach
        forEachIndexed { index,value -> do stuff
        like python enumerate list


        //We can give names to loops and go straight to them when something happens
        // can lead to spaghetti code so only use when totally necessary
        outer@ for (n in 2..100) {
            for (d in 2 until n) {
                if (n % d == 0) {
                    continue@outer
                    //break@outer  //
                }
              }
            println("$n is prime")
            }
    */


    for (i in 0..15) {
        //println(i)
        if (i == 10) {
            //i.minus(1)
           // println(i)
        }
    }

    val newRange = 1..15
    for (i in newRange.step(3)) {
        //println(i)
    }

    val intRange = 1..5
    val strRange = "ABD".."XYZ"

    println(2 in intRange)
    println("a" in strRange)

    val downRange = 5.downTo(1)
    println(2 in downRange)

    println("Es palindromo : ${palindromeProblem("anita lava la tina")}")

    // this form includes the last number
    for(num in 0..6 step (2)){
        //do something
    }

    //this way the last number is not included
    for(num in 0 until 10){
        //do something
    }

    for(num in 20 downTo 2 step (2)){
        //do something
    }

}

fun palindromeProblem(word : String) : Boolean{
    var index = word.length-1
    val limit = (word.length-1) /2
    var front : Char
    var back : Char

    var i = 0

    //Kotlin does not allow change the iterator so while is used
    while (i < limit){
        front = word[i]
        back = word[index]

        if (front.isWhitespace()){
            i++
            continue
        }
        if (back.isWhitespace()){
            index--
            continue
        }
        if (front != back){
            return false
        }
        index--
        i++
    }
    return true
}






