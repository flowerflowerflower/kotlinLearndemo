package com.example.lw_szyf_3020004.kotlinlearn.extensions

import java.nio.channels.spi.AsynchronousChannelProvider

object DataProviderManager{//单例的使用

    val a:String=""

    lateinit var provider:AsynchronousChannelProvider



    fun registerDataProvider(provider: AsynchronousChannelProvider){


    }

    class MyClass{
        companion object Factory{
            fun create():MyClass= create()
        }
    }





}

fun main() {
    val instance = DataProviderManager.MyClass.create()
}