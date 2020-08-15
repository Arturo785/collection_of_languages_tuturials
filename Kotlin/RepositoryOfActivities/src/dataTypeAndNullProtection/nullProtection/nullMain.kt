package dataTypeAndNullProtection.nullProtection

fun main() {
    var nullable : Int? = null
    var nullableStr : String? = null

    //nullable = 5
    nullableStr = "Hola"

    println(nullableNumber(nullable))

    val canBeNull = nullableString(4)
    //This two are the same
    println(canBeNull?.toUpperCase())

    if (canBeNull != null){
        println(canBeNull.toUpperCase())
    }

    //or this
    // let is used when more things have to be done with the value if it is not null
    canBeNull?.let {
        println(it.toUpperCase())
        // do more stuff
    }

    // this can be done
    //val closestBank = anotherBank?.address?.country?.countryCode

    //This one assigns a default value
    //val closestBank = anotherBank?.address?.country?.countryCode ?: 0

    /*is like this

    if(anotherBank != null){
        val adress = anotherBank.address
        if(address != null){
            val otherThing
            if(otherThing != null)
        }
    }*/

    val nullableArray = arrayOfNulls<Int?>(4)

    val otherNull = nullableArray[5]?.toDouble()

    nullableArray.forEach {
        println(it)
    }
}

fun nullableNumber(num1 : Int?) : Int {
    return num1 ?: 0
}

fun nullableString(number : Int) : String?{
    return if (number % 2 == 0){
        "No nulo"
    }
    else{
        null
    }
}