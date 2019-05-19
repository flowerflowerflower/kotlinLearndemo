package com.example.lw_szyf_3020004.kotlinlearn.delegation

interface JJ{
    val message:String
    fun print()
}

class JJImp(val x:Int):JJ{

    override val message: String
        get() = "JJImp:x= $x"

    override fun print() {
        println(message)
    }
}

class JJDerived(b:JJ):JJ  by b{

    override val message: String
        get() = "JJDerived"


}

fun main() {
    val jjImp:JJImp= JJImp(10)

    JJDerived(jjImp).print()
   println(JJDerived(jjImp).message)
}