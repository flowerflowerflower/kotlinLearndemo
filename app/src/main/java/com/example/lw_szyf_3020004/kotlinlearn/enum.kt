package com.example.lw_szyf_3020004.kotlinlearn

enum class LogLevel(val id:Int){

    ONE(1),
    TWO(2),
    THREE(3);

    fun getTag():String{
        return "$id,$name"
    }
}

fun main() {
    println(LogLevel.TWO.getTag())
    println(LogLevel.TWO.ordinal)
    LogLevel.values().map(::println)
}