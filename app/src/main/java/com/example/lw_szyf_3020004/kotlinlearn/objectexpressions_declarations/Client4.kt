package com.example.lw_szyf_3020004.kotlinlearn.objectexpressions_declarations



interface BB{
    val x:Int
    fun get(){
        println(x)
    }
}



class CCC(val a:BB){

    val c:Int =1



    fun get(){
      a.get()
    }

}

fun main() {
    val result:CCC=CCC(object :BB{
        override val x: Int
            get() = 30
    })

    result.get()
    println(ZCCCC.a)


}



