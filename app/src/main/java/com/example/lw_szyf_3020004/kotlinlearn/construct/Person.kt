package com.example.lw_szyf_3020004.kotlinlearn.construct



class Person constructor(firstName:String) {
    var name="First property:$firstName";

    lateinit var like:String

    init {
        println("Second initializer block that prints ${name.length}")
    }

    init {
        println("Second initializer block that prints ${name.length}")
    }

    fun namePrint(){

        println("name initializer block that prints ${name.length}")

    }

}