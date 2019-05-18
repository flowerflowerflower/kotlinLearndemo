package com.example.lw_szyf_3020004.kotlinlearn.extensions

fun MutableList<Int>.swap(index1:Int,index2:Int){
    val tmp= this[index1]
    this[index1]=this[index2]
    this[index2]=tmp
}




fun main() {
    val l:MutableList<Int> = MutableList(5){
        index ->index
    }

    l.add(1)
    l.add(2)

    l.swap(0,1)

}
