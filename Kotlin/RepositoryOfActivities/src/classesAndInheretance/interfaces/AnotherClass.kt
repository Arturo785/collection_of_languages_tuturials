package classesAndInheretance.interfaces


fun main() {
    val x = AnotherClass()

    println(x.getFromStringResources(5))


}

class AnotherClass : IMyInterface.OtherInner<Int> {

    override fun setPresenter(anyThing: Int) {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        TODO("Not yet implemented")
    }


}

class AloneInterfaceImplementer(override var justSomeThing: Int): aloneInterface{

    override fun aloneMethod() {
        TODO("Not yet implemented")
    }

}