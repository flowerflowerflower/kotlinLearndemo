package com.example.lw_szyf_3020004.kotlinlearn.extensions

class MyClass{
    companion object{}
}

interface Factory<T>{
    fun create():T
}


class MyClasses{
    companion object:Factory<MyClass>{

        override fun create(): MyClass= MyClass()
    }
}


fun main() {
    val a=MyClass.Companion;

    val f:Factory<MyClass> =MyClasses.Companion
















}