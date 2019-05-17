package com.example.lw_szyf_3020004.kotlinlearn.interfaces

interface Named{
    val name:String
}


interface Person:Named{
    val firstName:String
    val lastName:String
    override val name:String get() = "$firstName $lastName"
}

class Employee(override val firstName:String,override val lastName:String,val position:String):Person{

    fun g(){
        println(name)
    }
}

fun main() {

    val e:Employee= Employee("张","成","1")
    e.g()

}


