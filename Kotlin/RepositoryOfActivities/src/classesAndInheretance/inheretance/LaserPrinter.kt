package classesAndInheretance.inheretance

class LaserPrinter(brand : String, size : Int) : Printer(brand,size){

    val anotherProperty = justSomeInt

    override fun thisCanBeOverridden() {
        super.thisCanBeOverridden()
        println("Overridden")
    }

}

fun main() {
    val myPrinter = LaserPrinter("HP",4)

    println(myPrinter.brand) // size is protected so it can´t be printed from here
    myPrinter.thisCanBeOverridden()
    myPrinter.thisCanNotBeOverridden()
}