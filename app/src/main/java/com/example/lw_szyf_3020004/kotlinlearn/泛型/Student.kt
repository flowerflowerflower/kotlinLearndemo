package com.example.lw_szyf_3020004.kotlinlearn.泛型

class Student<H> (private val a:H){


    fun getToast():H{
        return a
    }
}