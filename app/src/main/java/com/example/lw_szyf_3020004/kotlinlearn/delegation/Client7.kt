package com.example.lw_szyf_3020004.kotlinlearn.delegation

class Userrs(val map:Map<String,Any?>){

    val name:String by map
    val age:Int by map
}


fun main() {
    val user =Userrs(mapOf("name" to "John Doe","age" to 25))
    println(user.name)
    println(user.age)

}



