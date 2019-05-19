package com.example.lw_szyf_3020004.kotlinlearn.visibility_modifiers

private fun foo(){
    println("out")
}

public var bar:Int =5
           private set

internal val baz = 6
