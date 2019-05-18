package com.example.lw_szyf_3020004.kotlinlearn.extensions

open class C
class D:C()

fun C.foo()="c"

fun D.foo()="d"

fun printFoo(c:C){
    println(c.foo())
}


fun main() {
    printFoo(D())
}



