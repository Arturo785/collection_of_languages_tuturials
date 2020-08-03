package mytest


fun main(args : Array<String>){
    val myObject1 = StaticClassExample()
    val myObject2 = StaticClassExample()
    val myObject3 = StaticClassExample()

    println(myObject1.id)
    println(myObject2.id)
    println(myObject3.id)

    StaticClassExample.imAStaticMethod("Jorge")
}