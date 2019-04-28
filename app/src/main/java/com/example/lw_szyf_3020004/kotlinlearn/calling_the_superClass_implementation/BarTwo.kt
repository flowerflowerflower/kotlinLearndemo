package com.example.lw_szyf_3020004.kotlinlearn.calling_the_superClass_implementation


/***
 * inside an inner class, accessing the superclass of the outer class is done with the super keyword qualified with the outer class name: super@Outer:
 */
class BarTwo:Foo() {
    override fun f(){

    }

    override val x: Int
        get() =1


   inner class Baz{
       fun g(){
           super@BarTwo.f()//// Calls Foo's implementation of f()
           println(super@BarTwo.f())//Uses Foo's implementation of x's getter
       }
   }
}