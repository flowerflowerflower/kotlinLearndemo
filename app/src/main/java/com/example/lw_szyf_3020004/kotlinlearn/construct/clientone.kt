package com.example.lw_szyf_3020004.kotlinlearn.construct



open class Foo{

    open val x:Int get() = 1
}


class Bar1:Foo(){

    override val x: Int
        get() = super.x
}