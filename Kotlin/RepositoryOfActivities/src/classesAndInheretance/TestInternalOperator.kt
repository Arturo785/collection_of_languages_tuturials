package classesAndInheretance

fun main() {
    val test = ExampleWithInternal("Alonso")

    val useOfInternal = test.justANumberInternal
    val useOfPublic = test.publicValue
    println(useOfInternal)
    println(useOfPublic)

}

