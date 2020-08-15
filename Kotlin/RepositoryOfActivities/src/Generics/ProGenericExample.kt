package Generics

/* https://www.geeksforgeeks.org/kotlin-generics/
Unlike Java, Kotlin makes arrays invariant by default. By extension,
 generic types are invariant in Kotlin. This can be managed by the out and in keywords.
  Invariance is the property by which a standard generic function/class already
   defined for a particular data type, cannot accept or return another datatype.
* */

//In Kotlin, we can use the out keyword on the generic type which means
// we can assign this reference to any of its supertypes.
// The out value can only produced by the given class but can not consumed:


//Above, we have defined an OutClass class that can produce a value of type T.
// Then, we can assign an instance of the OutClass to the reference that is a supertype of it:


//If we want to assign it to the reference of its subtype then we can use the in keyword
// on the generic type. The in keyword can be used only on the parameter type that is consumed,
// not produced:



