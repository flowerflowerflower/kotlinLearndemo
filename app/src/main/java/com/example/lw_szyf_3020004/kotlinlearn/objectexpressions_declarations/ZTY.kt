package com.example.lw_szyf_3020004.kotlinlearn.objectexpressions_declarations

import com.example.lw_szyf_3020004.kotlinlearn.extensions.Factory
import com.example.lw_szyf_3020004.kotlinlearn.extensions.MyClass

class ZTYY{
    companion object Factory{

        lateinit var a:BB

    }

    fun getInstacne():BB{

        a=object :BB{
            override val x: Int
                get() =3
        }
        return  a
    }

}


fun main() {

 val a=   ZTYY().getInstacne()
 val b=   ZTYY().getInstacne()
    if(a===b){
        println("a===b")
    }else{
        println("false")
    }
}