package com.example.lw_szyf_3020004.kotlinlearn.`object`

import kotlin.reflect.KProperty

class Delegates{
    val hello by X()


}

class X{

    private var value:Any?=null
    operator  fun getValue(thisRef:Any?,property:KProperty<*>):String{

        return  "hello"
    }

    operator  fun setValue(thisRef:Any?,property:KProperty<*>,value:Any){

        this.value=value

    }
}

fun main() {
    val delegates = Delegates()
    delegates.hello
}