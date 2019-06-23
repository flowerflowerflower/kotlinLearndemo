package com.example.lw_szyf_3020004.kotlinlearn.kotlin双冒号


fun getResult(str1: String, str2: String): String = "result is {$str1 , $str2}"


fun lock(p1: String, p2: String, method: (str1: String, str2: String) -> String): String {

    return method(p1, p2)
}


class Test1{
    fun isOdd(x:Int) =x%2!=0

    fun test(){
        val list = listOf(1,2,3,4,5)
        println(list.filter(this::isOdd))
    }
}

fun main(args: Array<String>) {
    println(lock("a", "b", ::getResult))
}