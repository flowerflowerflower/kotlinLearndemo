package com.example.lw_szyf_3020004.kotlinlearn.delegation

interface ZYNN{
    fun printMessage()
    fun printMessageLine()
}

class ZYNNImpl(val x:Int):ZYNN{
    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
       println(x+100)
    }
}

class ZUNNDERIVED(b:ZYNNImpl):ZYNN by b{
    override fun printMessage() {
        println("toast")
    }
}

fun main() {
    val b =ZYNNImpl(10)
    val c: ZUNNDERIVED=ZUNNDERIVED(b);
    c.printMessage()
    c.printMessageLine()
}

