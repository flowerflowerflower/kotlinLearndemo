package com.example.lw_szyf_3020004.kotlinlearn.construct

class PersonThree {

    constructor(like:String){
        println(like)
    }


    constructor(zc:String,hc:String):this(zc){
        println(hc)
    }




}