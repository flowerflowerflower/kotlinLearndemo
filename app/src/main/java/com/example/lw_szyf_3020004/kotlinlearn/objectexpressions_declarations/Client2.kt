package com.example.lw_szyf_3020004.kotlinlearn.objectexpressions_declarations

fun foo(){
    val adHoc= object{
        val x:Int =0
        val y:Int =1
    }

    println(adHoc.x+adHoc.y)
}



fun main() {
    foo()
}