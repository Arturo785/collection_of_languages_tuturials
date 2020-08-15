package classesAndInheretance.interfaces

interface IMyInterface {

    interface oneInnerInterface {
        fun onDestroy()
    }

    interface OtherInner<T> {
        fun setPresenter(anyThing: T)
        fun onDestroy()

        // used by the home icon
        fun goToLanguageActivity() {

        }

        // gets the string resource and sends the message when is needed
        fun getFromStringResources(id: Int): String {
            return "Hola + $id"
        }
    }
}

interface aloneInterface{

    var justSomeThing : Int

    fun aloneMethod()
}