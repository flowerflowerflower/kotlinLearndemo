package com.example.lw_szyf_3020004.kotlinlearn.construct



open class ZYN{
     open fun f(){
         println("Foo.f()")
     }
     open val x:Int get()=1
}



class ZYNN:ZYN(){
    override fun f() {
        super.f()
    }

    override val x: Int
        get() = super.x+1

    inner class LION{
        fun g(){
            super@ZYNN.f()
            println(super@ZYNN.x)
        }
    }


}

fun main() {
    val b:ZYNN.LION=ZYNN().LION()

    b.g()

}