package com.example.lw_szyf_3020004.kotlinlearn.construct


open class Base(val name:String){
    init {
        println("Initializing Base")
    }

    open val size:Int = name.length.also { it->
         val a=3
         val b=4
        println("Initializing size in Base: $it")
    }
}


class Derived(name:String,val lastName:String):Base(name.capitalize().also { println("Argument for base:$it") }){

    init {
        println(println("initializing Derived"))
    }

    override val size: Int
        get() =
            lastName.length.also {  println("Initializing size In Derived:$it") }
}

fun main() {
     val a:Derived=Derived("张成","你好")
     a.size;


}