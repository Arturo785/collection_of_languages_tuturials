package classesAndInheretance.sealedClases


// Reference: https://medium.com/@douglas.iacovelli/how-to-handle-errors-with-retrofit-and-coroutines-33e7492a912


// When using sealed classes are like a superEnum in which it can only be one type at the time
// And it's used with a "when" to make exhaustive search
// if the response receives something like a value or code data class or class can be used
// data Class is used it the class is only needed for hold data
// if the class has nothing to receive use object like the example below


sealed class Animals{
    class Dog(val someDogAttribute : String) : Animals(){
        fun display()
        {
            println("Wow wow")
        }
    }
    data class Cat(val someCatAttribute: String) : Animals()
    object anotherThing : Animals() // when no things passed can be an object
}

fun main() {

    //val _1Animal = Animals.Dog("Pulgas")
    //val _1Animal = Animals.Cat("ww")
    val _1Animal =  Animals.anotherThing

    checkType(_1Animal)

}
fun checkType(myParameter : Animals){
    when(myParameter){
        is Animals.Dog ->
            println(myParameter.display())
        is Animals.Cat ->
            println("Soy un gato we")
        is Animals.anotherThing ->
            println("Sepa que soy jajaj")
    }
}

