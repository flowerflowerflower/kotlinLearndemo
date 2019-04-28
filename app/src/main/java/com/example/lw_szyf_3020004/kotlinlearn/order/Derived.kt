package com.example.lw_szyf_3020004.kotlinlearn.order

class Derived (name:String,
               var lastname:String
  ):Base(name.capitalize().also { println("Initializing size in Base: $it")  }){//one

    init {
        println("Initializing Derived")//four
    }

    override val size:Int=(super.size+lastname.length).also { println("Initializing size in Derived: $it") }//five

}