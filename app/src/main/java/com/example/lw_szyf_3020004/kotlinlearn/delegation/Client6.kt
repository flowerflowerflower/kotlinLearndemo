package com.example.lw_szyf_3020004.kotlinlearn.delegation

import kotlin.properties.Delegates

class User{
    var name:String by Delegates.observable("<no time>"){
        prop,old,new->
        println("$old ->$new")
    }
}

fun main() {
    val user =User()
    user.name="ddd"
    user.name="zzz"

}