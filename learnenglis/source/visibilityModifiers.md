## Visibility Modifiers
Classes,objects,interfaces,constructors,functions,properties and  their setters can have visibility modifiers.
(Getter always have the same visibility as the property.) There are four visibility  modifier in kotlin:
private ,protected ,internal and public.The default visibility.used if there is no explicit modifier,is public .


Below please find explanation of how the modifiers apply to different types of declaring scopes.


Packages
Functions,properties and classes,objects and interfaces can be declared on the "top-level",i.e.directly inside a package:

```
package foo

fun baz(){ ...}
class Bar{...}
```
--- if you do not  specify any visibility modifier,public is used by default,which means that your declarations will be visible everywhere ;
--- if you mark  a declaration private ,it will only  be visible inside  the file containing the declaration;
--- if you mark  it  internal,it is visible everywhere in the same module;
-protected is not available for top-level declaration from another package,you should still import it .

Example:
...package foo
   private fun foo(){//visible inside example.kt
     ```
   }
   public var bar:Int =5 //property is visible everywhere

   private set

   internal val baz{
   ···
   }

   internal val baz = 6;  //visible inside the same module

```

Classes and Interfaces
For members declared inside a class:
--- private means visible inside this class only(including all its member);
--- protected -- same as private +visible in subclasses too;
--- internal --any client inside this module who sees the declaring class sees its internal member;
--- public -- any client who sees the declaring class sees its public members;

Note for java users: outer class does not see private members of its inner classes in Kotlin.

if you override a protected member and do not specify the visibility  explicitly,the overriding member will also have protected visibility.

examples:

````
open class Outer{
  private val a = 1;
  protected open  val b=2;
  internal val c = 3;
  val d = 4 //public by default

  protected class Nested {
    public val e:Int =5;
  }

  class Subclass :Outer(){
    //a is not visible
    //b,c and d
    //Nested and e are visible

    override val b = 5 //'b' is protected


  }

  Class Unrelated(o:Outer){
  // o.a,o.b are not visible
  // 0.c and o.d are visible (same module)

  //Outer.Nested is not visible ,and Nested::e is not visible either

  }


}

````


Constructors
To specify a visibility of the primary constructor of a class,use the following syntax (note that
you need to add an explicit constructor keyword):
```
class C private constructor(a:Int){...}
```
Here the constructor is private .By default,all constructors are public ,which effectively amounts to them being visible everywhere where the class
is visible(i.e  a constructor of an internal class is only visible within the same module).

Local declarations
Local variable.functions and class can not have visibility modifiers.
Modules
The internal visibility modifiers means that the member is visible within the same module,More specifically ,a module is a set of Kotlin files compiled together
--- an Intellij IDEA module;
--- an Maven project;
--- an Gradle source set(with the exception that the test source set can access the internal declarations if main )
--- a set of files  compiled with one invocation of the <kotlinc> ant task





























