package com.example.lw_szyf_3020004.kotlinlearn.construct

open class HC{
   open  fun f(){
        print("A")
    }
    fun a(){
        print("a")
    }
}

interface HCC{
    fun f() { print("B")}
    fun b() { print("b")}
}

open class HCCC:HC(),HCC{

   open override fun f() {
        super<HC>.f()
        super<HCC>.f()
    }
}



fun main() {


    val a:HCCC=HCCC()
    a.f()
    a.a()
    a.b()

}


