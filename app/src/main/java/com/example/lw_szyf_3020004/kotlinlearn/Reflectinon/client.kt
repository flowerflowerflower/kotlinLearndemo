package com.example.lw_szyf_3020004.kotlinlearn.Reflectinon


data class Person(val nameperson3person3:String,val age:Int){

}

class DefaultConstructor()

fun Person.sayHello(){
    println("Hello")
}



fun main() {

    val clazz = Person::class.java
    val person = Person("benny",18)
    val clazz2 = person.javaClass
    val clazz3 = person::class.java

    val defaultConstructor=DefaultConstructor::class.java.newInstance()

    val person2 =clazz2.getConstructor(String::class.java,Int::class.java).newInstance("b",18)

    val name =clazz2.getDeclaredField("name").apply{ isAccessible=true}.get(person2)

   // val person3 =clazz2.getMethod("copy",String::class.java,Int::class.java).invoke(person2,"dfd",1)

  //  print(person3)



}