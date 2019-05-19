package com.example.lw_szyf_3020004.kotlinlearn.objectexpressions_declarations

class C{
    private fun foo() =object{
        val x:String ="111"
    }

   private  fun publicFoo() = object {
        val x:String="222"
    }

    fun bar(){
        val x1 = foo().x
    }
}