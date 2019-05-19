package com.example.lw_szyf_3020004.kotlinlearn.delegation

import android.support.v7.app.ActionBarDrawerToggle
import kotlin.reflect.KProperty

class Example{
    var p:String by Delegate()
}


class Delegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main() {
    val e= Example()
    println(e.p)
    e.p="New"
}


