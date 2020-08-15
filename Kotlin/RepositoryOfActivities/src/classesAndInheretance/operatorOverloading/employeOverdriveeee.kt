package classesAndInheretance.operatorOverloading

class employeOverdriveeee(val name : String = "", var age : Int = 0){


    override fun toString(): String {
        return "employeOverdriveeee(name='$name', age=$age)"
    }

    // se sobreescribe el operador en base a lo que queramos
    operator fun plus(e : employeOverdriveeee) : employeOverdriveeee{
        return employeOverdriveeee("sumado", age + e.age)
    }

    operator fun compareTo (e : employeOverdriveeee): Int {
        return age.compareTo(e.age)
    }
}

fun main() {
    val one = employeOverdriveeee("Jorge",21)
    val two = employeOverdriveeee("Jorge 2",4)

    //sin la sobrecarga no seria posible
    val sum = one + two

    println(sum)
    println(one > two)
}