package com.example.lw_szyf_3020004.kotlinlearn.delegation

interface Base{
    fun print()
}

class BaseImpl(val x:Int):Base{
    override fun print() {
      print(x)
    }
}

class Derived(b:Base):Base by b

fun main() {
    val b =BaseImpl(10)
    Derived(b).print()
    val result = with(100){
        this+20
    }
    println(result)
}



