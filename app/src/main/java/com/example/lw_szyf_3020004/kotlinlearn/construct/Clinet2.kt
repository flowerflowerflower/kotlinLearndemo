package com.example.lw_szyf_3020004.kotlinlearn.construct

interface A{
    val count:Int
}

class B(override val count: Int):A

class C :A{
    override val count: Int
        get() =0
}