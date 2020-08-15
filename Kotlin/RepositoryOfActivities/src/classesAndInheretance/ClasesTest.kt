package classesAndInheretance


//all the info here https://kotlinlang.org/docs/reference/visibility-modifiers.html

//private attributes are only visible in the class, can not have getter or setter outside class

//**************************************************************************************

/*If you want code outside the class to be able to read and modify the value of the property, then you don't want it to be private. Private means you want it closed to the outside world.

If you want a setter and getter for the field, there's no need to declare them yourself. You should declare fullTime without the private modifier. Under the covers, the field will be declared as private and Kotlin will generate a setter and getter for it.

Remember that in Kotlin we're dealing with properties, not fields, so when you declare a field in Kotlin, you're actually declaring a property. It will be private, and a setter and getter will be generated for it.

Here's an article from JetBrains that might help explain the difference:

https://blog.kotlin-academy.com/kotlin-programmer-dictionary-field-vs-property-30ab7ef70531*/


val MY_CONSTANT = 100 // this is how we can declare constants

fun main() {
    // in kotlin Classes can be private and if so only the file can access to the class
    // other parts of the program don't
    val exampleOne = ExampleOfClass("Jorge","Hello")
    val exampleTwo = ExampleOfClass("Jorge")
    val exampleThree = ExampleOfClass("Jorge")
    val setterAndGetter = ExampleWithInternal("Lala",customSetterAndGetter = 5)
    val setterAndGetter2 = ExampleWithInternal("Lala",customSetterAndGetter = 5)

    println("exampleTwo == ExampleThree ${exampleTwo == exampleThree}") // returns true because is a dataClass
    println("setterAndGetter == setterAndGetter2 ${setterAndGetter == setterAndGetter2}") // returns false because does not have
    //hashCode overridden or compare


    println(exampleOne.concatenate())
    println(exampleTwo.concatenate())

    setterAndGetter.setAnotherPrivate(20)
    println(setterAndGetter.getAnotherPrivate())

    setterAndGetter.customSetterAndGetter = MY_CONSTANT
    val myGetterTest = setterAndGetter.customSetterAndGetter

}


//data class is used to only hold data and automatically overrides hashCode, toString and more
private data class ExampleOfClass(val name:String, val message : String = "Default"){

    fun concatenate():String{
        return "inside fun without purpose $name, $message"
    }
}

//make class public is redundant because by default are public and Final

public class ExampleWithInternal(val name:String, val message : String = "Default",
                                 customSetterAndGetter: Int = 0){

    var customSetterAndGetter = customSetterAndGetter
    get(){
        println("Using custom getter")
        return field
    }
    set(value){
        println("Using custom setter")
        field = value
    }

    internal val justANumberInternal : Int //visible inside de module
    private var anotherPrivate : Int //only visible in the class, can not have getter or setter outside class
    val publicValue : Int // visible everywhere

    init {
        justANumberInternal = (0..100).random()
        anotherPrivate = justANumberInternal -10
        publicValue = anotherPrivate + justANumberInternal
    }

    fun concatenate():String{
        return "inside fun without purpose $name, $message"
    }


    //Possible but not recommended
    //Private should only be used when we want field to only exist in the class
    // otherwise the normal "val" "var" does the Property get set for us like c#

    //Like this

   /* private string name; // field

    public string Name   // property
    {
        get { return name; }   // get method
        set { name = value; }  // set method
    }*/

    fun setAnotherPrivate(anotherPrivate: Int){
        this.anotherPrivate = anotherPrivate
    }

    fun getAnotherPrivate() : Int{
        return this.anotherPrivate
    }
}