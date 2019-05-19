package com.example.lw_szyf_3020004.kotlinlearn.objectexpressions_declarations

open class A(x:Int){

    public open val y:Int =x
}

interface B{
    fun get()
}

fun main() {
    val ab:A=object :A(1),B{
        override fun get() {
            println(" i love you")
        }

        override val y: Int
            get() = super.y
    }


    if(ab is B){
        print("q")
    }

   val b:B=ab as B
    b.get()
   println(ab.y)

}