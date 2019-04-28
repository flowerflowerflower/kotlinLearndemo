package com.example.lw_szyf_3020004.kotlinlearn.construct

import java.sql.DriverManager.println

class Person constructor(firstName:String) {
    var name="First property:$firstName";


    init {
        println("Second initializer block that prints ${name.length}")
    }

    init {
        println("Second initializer block that prints ${name.length}")
    }

}