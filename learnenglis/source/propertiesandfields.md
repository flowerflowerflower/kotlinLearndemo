## Properties and  Fields
Declaring Properties
Classes in Kotlin can have properties.These can be declared as mutable,using the var keyword or read-only using the val keyword
```
class Address{
  var name:String =...
  var street:String = ...
  var city :String ?= ...
  var zip: String = ...

}
```


##  To use a property. we simply refer to it by name,as if it were a field in java:

```
fun copyAddress(address:Address):Address{
   val result = address()//there is no 'new' keyword in Kotlin
   result.name = address.name//accessors are called
   result.street = andress.street

   return result
}
```

## Getters  and Setters

The full syntax for declaring a property is

```
var <propertyName>[:<propertyName>][= <property_initializer]
[<getter>]
[<setter>]

```

The initializer,getter and setter are optional ,Property type is optional if it can be inferred from the initializer
（or from the getter return type,as show  below）

Examples:
```
var allByDefault :Int ?//error :explicit initializer required.defualt getter and setter implied
var  initialized =1 //has type int,default getter and setter
```

We can define custom accessors  for property. If we define a custom getter.it will  be called every time we access the property(this allows us to implement  a computed property).Here is an example of a custom gettter
>> getter
```
val isEmpty:Boolean
     get()=this.size==0
```


>>if we define a custom setter , it will be called every time we assign  a value to the property.A custom setter look like this:

```
var  stringRepresentation:String
     get() = this.toString()
     set(value){
     setDataFromString(value)// parses the string  and  assigns values to other properties
```

By Convention,the name of the setter parameter is   value,but you can choose a different name if you prefer

Since Kotlin 1.1,you can omit the property type  if it can be inferred from the getter

val isEmpty get()=this.size ==0 //has type Boolean

If you need  to change the visibility of an accessor  or to annotate it,but  do not need to change the default implementation, you can define the accessor without defining its  body:
```
var setterVisibility:String ="abc"
     private set // the setter is  private and has the default implementation
var setterWithAnnotation:Any?=null
  @Inject set// annotate  the setter with Inject
```

Backing Fields

Fields can not be declared directly in  Kotlin classes ,However when  a property needs a  backing field.Kotlin provides it automatically.This backing field  can be referenced in the accessors using  the field identifier:
```
var counter = 0//Note :the initializer assigns the backing field directly
      set(value){
        if(value>=0) field=value
      }
```









