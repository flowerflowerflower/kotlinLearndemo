package com.example.lw_szyf_3020004.kotlinlearn.construct


fun main() {
    val p:Person= Person("dfdf")
   // p.like="zc"
    p.like="zcdf"
    println(p.like?.length)
  //  println(p.like)
    p.namePrint()
    val a:Int = 10000
    println(a===a)
    val boxedA:Int?=a
    val anotherBoxedA:Int?=a;
    println(boxedA===anotherBoxedA)
    val b:Byte=1


    val s="runoob"
    val str ="$  s.length is ${s.length}"
    println(str)

    val person:PersonThree= PersonThree("ddf")

    val personTwo:PersonThree=PersonThree("zc","hc")








}