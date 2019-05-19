package com.example.lw_szyf_3020004.kotlinlearn.classes_and_Inheritance

class Outer{
    val bar:Int =1
    class Nested{
        fun foo()=2
    }
}

class OuterOne{
    private val bar:Int=1
    inner class Nested(){
        fun foo() =bar
    }
}


fun main() {
   // val demo = Outer.Nested().foo()

    println(OuterOne().Nested().foo())

}