package com.example.lw_szyf_3020004.kotlinlearn.calling_the_superClass_implementation


/**
 * Code in a derived class can call its superclass functions and property accessors implementations using the
 */
class Bar : Foo() {

    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override var x: Int = super.x + 4

}