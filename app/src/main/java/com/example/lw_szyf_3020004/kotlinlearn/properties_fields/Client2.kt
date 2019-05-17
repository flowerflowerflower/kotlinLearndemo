package com.example.lw_szyf_3020004.kotlinlearn.properties_fields


public class MyTest{
    lateinit var subject: String
    fun isCheck(){
      if(this::subject.isInitialized){
          //
      }else{
         //

      }
    }
}


fun main() {
    val a:MyTest= MyTest()
   // a.setup()

    println(a.subject)
}