package com.example.lw_szyf_3020004.kotlinlearn.order

open class Base(val name:String) {
    init{ println("Initializing Base")}//two

    open val size:Int =
            name.length.also { println("Initializing size in Base:$it") }//three

}