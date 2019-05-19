package com.example.lw_szyf_3020004.kotlinlearn.delegation

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}


fun main() {
    val list = asList(1, 2, 3)
}