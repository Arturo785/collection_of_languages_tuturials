package classesAndInheretance.inheretance


//Every constructor has to delegate to de primary constructor

open class Printer(var brand : String, protected var size : Int) {

    protected var justSomeInt : Int = 0

    open fun thisCanBeOverridden(){
        println("This can be overridden")
    }

    fun thisCanNotBeOverridden(){
        println("This can not be overridden")
    }

   // abstract fun implementYourself() if printer were abstract
}

/* abstract is open by default
abstract class Printer(val brand : String, protected var size : Int) {

    protected var justSomeInt : Int = 0

    open fun thisCanBeOverridden(){
        println("This can be overridden")
    }

    fun thisCanNotBeOverridden(){
        println("This can not be overridden")
    }
}*/
