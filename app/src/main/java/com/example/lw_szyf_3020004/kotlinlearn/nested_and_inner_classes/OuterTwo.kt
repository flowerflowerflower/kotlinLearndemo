package com.example.lw_szyf_3020004.kotlinlearn.nested_and_inner_classes

class OuterTwo {
    private val bar:Int =1
    inner class Inner {
        fun foo() =bar
    }
}