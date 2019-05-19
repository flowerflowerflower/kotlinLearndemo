package com.example.lw_szyf_3020004.kotlinlearn.delegation



class A{

    val eps=1E-10 //"good enough"
    tailrec fun findFixPoint(x:Double =1.0):Double
    =if(Math.abs(x - Math.cos(x))<eps) x else findFixPoint(Math.cos(x))
}