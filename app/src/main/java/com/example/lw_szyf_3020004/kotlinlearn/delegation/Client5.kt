package com.example.lw_szyf_3020004.kotlinlearn.delegation



class lazyCheng{
    val a:String by lazy{
        "hello"
    }

}

fun main(){
    val a:lazyCheng=lazyCheng()
    println(a.a)
}

