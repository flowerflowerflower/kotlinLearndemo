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
Fields cannot be declared directly in Kotlin classes.However.when a property needs a backing field.Kotlin provides it automatically. This backing field can be referenced in the accessors using the field identifier:
...
var counter = 0// Note: the initializer assigns the backing field directly
    set(value){
    if(value>=0)field=value
    }
...

The field identifier can only be used in the accessors of the property;

A backing field will be generated for a property if uses the default implementation of at least one of the accessors,or if a custom accessor references it through the field identifier


For  example , int thre following case there will be no backing field:
```
val isEmpty:Boolean
    get()=this.size==0
```

## backing Properties
if you want to something that does not fit into this "implicit backing field" scheme,you can always fall back to having a backing property:
```
private var _table:Map<String,Int>? =null
public val table:Map<String,Int>
           get(){
            if(_table == null){
               _table = HashMap() // Type paramters are inferred
            }
            return _table ?: trow AssertionError("Set to null by another thread")
            }
```
In all respects,this is just same as in java since access to private properties with default getters and setters is optimized so that no function call overhead is introduced

Compile-Time Constants

Properties the value of which  is known at compile time constants using the const modifier. such properties need to fulfil the following requirements


--- Top-level,or member of an object declaration or a companion  object
--- Initialized with a value of type String or primitive type
--- No custom getter
Such properties can be used in annotations:
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
@Deprecated(SUBSYSTEM_DEPRECATED)fun foo(){...}

## Late-Initialized Properties and Variables

Normally,properties declared as having a non-null type must be initialized int the constructor.However,fairly often this is not  convenient,for









