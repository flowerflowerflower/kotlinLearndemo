package com.example.lw_szyf_3020004.kotlinlearn.construct

open class ZTY{
    open fun f(){}
}

abstract  class ZT:ZTY(){

     abstract  override fun f()

}


class ZTT(var a:ZT){

    fun g(){
        a.f()
    }
}


fun main() {

    val b:ZTT=ZTT(object :ZT(){
        override fun f() {
             val a:Int=1;
            println(a)
        }
    })

    b.g()



}