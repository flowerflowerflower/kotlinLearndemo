package com.example.lw_szyf_3020004.kotlinlearn.extensions

import java.lang.Exception

class Box<T>(t:T){
    var value = t
}

interface Source<out T>{
    fun nextT():T
}


interface  Source2<T>{

    val a:T



}

fun demo(strs:Source<String>){
    val objects:Source<Any> =strs
}

fun <T> singletonList(item:T):List<T>{
    val a:MutableList<T> = mutableListOf()
    a.add(item)
    return a

}



fun main() {
    val a= singletonList(1)
    val b= a as MutableList
    b.add(2)
    println(b.get(1))
    demo(object:Source<String>{
        override fun nextT(): String {
           val result="11"
           return  result
        }
    })


}