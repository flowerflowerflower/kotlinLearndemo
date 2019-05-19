package com.example.lw_szyf_3020004.kotlinlearn.delegation


fun dfs(a:String){
    val list:MutableList<String> = mutableListOf()
    list.add("a")
    list.add("b")

    fun dfs(current:String){
        if(list.contains(current)){
            println("yes")
        }else{
            println("no")
        }
    }

    dfs(a)
}

fun main() {
    dfs("a")
}