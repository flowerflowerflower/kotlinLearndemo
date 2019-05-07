## Extensions
Kotlin,similar to C # and Gosu,provides the ability to extend a class with new functionally without having to inherit from  the class or use any  type of design pattern such as Decorator.This is done via special declarations called extensions,Kotlin supports extension functions and extension properties.

Extension Functions
To declare an extension function, we need to prefix its name with a receiver type,i.e. the type being extended.The following  adds a swap function to MutableList<Int>:
fun MutableList<Int>:
```
fun MutableList<Int>.swap(index1:int,Index2:Int){
  val tmp= this[index1]
  this[index1]=this[index2]
  this[index] =tmp
}

```

The this Keyword inside an extension function corresponds to the receiver object(the one that is passed before the dot).Now,we can call such a function on any MutableList<Int>:
```
val l= mutableListOf(1,2,3)
l.swap(0,2)// 'this' inside 'swap()'will hold the value of ‘’
```

of course,this function makes sense for any MutableList<T>,and we can make it generic

fun<T> MutableList<T>.swap(index1:int.index2:Int){
  val tmp = this[index1]
  this[index1] =this[index2]
  this[index2] =tmp
}

We declare the generic type parameter before the function  name for it to be available in the receiver type expression.See Generic functions.


Extensions are resolved statically

Extension do not actually modify classes they extend .By defining an extension,you do not insert new members into a class ,but merely make new functions callable with the dot-notation on variables of this type.

we would  like to emphasize that extension functions are dispatched statically,i.e they are not virtual by receiver type .This means that the extension functions are dispatched statically.i.e they are not virtual by receiver type.This means that the extension function being called is determined by the type of the expression on which the function is invoked,not by the result of evaluating that expression at runtime.For example:
```
open class C
class D:C()
fun C.foo() = "c"
fun D.foo() = "d"
fun printFoo(c:C){
  println(c.foo())
}
printFoo(D())
```
This example will print"C",because the extension function being called depends only on the declared type of there, which is the C class.
if a class has a member



