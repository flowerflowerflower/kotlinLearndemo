package com.example.lw_szyf_3020004.kotlinlearn.construct


open class ZC{
    open fun f(){
        println("Foo.f()")
    }
    open val x:Int get()=1
}


class ZCC:ZC(){
    override fun f() {
        super.f()
        println("ZCC")


    }

    override val x: Int
        get() = super.x+1
}


fun main() {


    val a:ZCC=ZCC()
    a.f()


}