package com.example.lw_szyf_3020004.kotlinlearn.`object`



class Latitude  private constructor(val value:Double){
    companion object{
        fun ofDouble(double:Double):Latitude{
            return Latitude(double)
        }

        fun  ofLatitude(latitude:Latitude):Latitude{
            return Latitude(latitude.value)
        }
    }

}

fun main() {

}