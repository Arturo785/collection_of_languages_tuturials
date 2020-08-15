package classesAndInheretance.innerClassAndNested


// The nested classes in Kotlin do not have access to the outer class instance
class Outer {

    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
       // val x = a The nested classes in Kotlin do not have access to the outer class instance
        fun callMe() = "Function call from inside Nested class."
    }
}


//Inner classes carry a reference to an outer class, and can access outer class members.
class Outer2 {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(Outer.Nested().b)

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())


    val outer = Outer2()
    println("Using outer object: ${outer.Inner().callMe()}")

    println(outer.a)

    val inner = Outer2().Inner()
    println("Using inner object: ${inner.callMe()}")
}