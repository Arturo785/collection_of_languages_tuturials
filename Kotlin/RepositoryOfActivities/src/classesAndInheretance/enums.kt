package classesAndInheretance

enum class DepartmentSimple{

    IT,
    ACCOUNT,
    SALES,
    MOBILE
}

enum class DepartmentComplex(val numberOfEmployees : Int){

    IT(20),
    ACCOUNT(40),
    SALES(20),
    MOBILE(10);

    fun getEmployees(): Int{
        return numberOfEmployees
    }
}

fun main() {

    val anotherTest = DepartmentComplex.IT
    val anotherTest2 = DepartmentSimple.IT

    println(anotherTest.getEmployees())
    println(anotherTest2.ordinal)
}