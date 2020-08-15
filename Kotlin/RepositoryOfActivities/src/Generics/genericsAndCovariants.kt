package Generics



open class Flower(){

}

class Rose() : Flower(){

}

//In Kotlin, we can use the out keyword on the generic type which means we can assign this reference to
// any of its supertypes.
// The out value can only produced by the given class but can not consumed:

//We constraint the T type to only accept Flower types or any that is a subType of Flower
class Garden<out T: Flower>{
    /// https://www.geeksforgeeks.org/kotlin-generics/

    //T = invariant = Only the type declared in the fun
    //generic function/class already defined for a particular data type,
    // cannot accept or return another datatype

    //OUT Covariance

    //out = Covariance = substituting subtypes is acceptable, but supertypes is not
    // a generic class defined for Number can accept Int, but a generic class defined
    // for Int cannot accept Number.

    //val x: MyClass<Any> = MyClass<Int>()        // Error: Type mismatch
    //val y: MyClass<out Any> = MyClass<String>() // Works since String is a subtype of Any
    //val z: MyClass<out String> = MyClass<Any>() // Error since Any is a supertype of String

    //IN Contracovariance
    //It is used to substitute a supertype value in the subtypes
    // a generic class defined for Number cannot accept Int, but a generic class
    // defined for Int can accept Number

    //fun main(args: Array<String>) {
        //var a: Container<Dog> = Container<Animal>()  //compiles without error
        //var b: Container<Animal> = Container<Dog>()  //gives compilation error
    //}
}

fun tendGarden(roseGarden : Garden<Rose>){
    waterGarden(roseGarden)
}

fun waterGarden(garden : Garden<Flower>){

}