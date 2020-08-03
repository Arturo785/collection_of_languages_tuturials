package mytest

class StaticClassExample{

    var counterNormal : Int = 0
    val id : Int

    companion object{
        var staticCounter = 1

        fun imAStaticMethod(name :String){
            println("Holaaaa: $name")
        }
    }

    init {
        println("soy un constructor pero staticCounter vale $staticCounter")
        this.id = staticCounter++
    }


}