package com.example.lw_szyf_3020004.kotlinlearn.data

data class userData(val name:String,val age:Int){


}





fun main() {
    val one=userData("name",1)
    val two=one.copy(one.name,one.age)

    val jane = userData(name ="jack",age =1)
    val (name,age)=jane
    println("$name,$age years of age")
    println(one==two)
}

