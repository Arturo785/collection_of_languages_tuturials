package dataTypeAndNullProtection

fun main() {
    val myInt = 20
    var myLong = 20L

    myLong = myInt.toLong()
    myLong = myInt.toLong()

    val myByte : Byte = 111
    var myShort : Short
    myShort = myByte.toShort()

    println(onVacation(true))

    val vacationFromJavaStr = OnVacationClass().onVacationFromJava(true) // creates the instance and then calls
    val staticStr = OnVacationClass.onVacationFromJavaStatic(false)
    println(vacationFromJavaStr)
    println(staticStr)


}

fun onVacation(vacation : Boolean) : String{
    return if (vacation){
        "I'm on vacation"
    }
    else{
        "I'm working"
    }
}