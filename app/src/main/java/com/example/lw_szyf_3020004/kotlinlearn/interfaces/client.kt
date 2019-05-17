package com.example.lw_szyf_3020004.kotlinlearn.interfaces

interface MyInterface {
    fun bar()
    fun foo() {

    }

}


class Child : MyInterface {
    override fun bar() {
    }
}


interface MyTwo {
    val prop: Int//抽象的

    val propertyWithImplementions: String
        get() = "foo"

    fun foo() {
        println(propertyWithImplementions)
        print(prop)
    }
}

class CC : MyTwo {
    override val prop: Int
        get() = 22
}

fun main() {
    val a: CC = CC();
    a.foo()
}










