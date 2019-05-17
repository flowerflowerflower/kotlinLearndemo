package com.example.lw_szyf_3020004.kotlinlearn.properties_fields


const val AB:String="dfdf"





class Address{

    var name:String="1"
    var street:String ="111"
    var city:String="222"
    var state:String?="111"

    var isEmpty:Boolean get() = this.name.length>0
       set(value) {

       }
    var counter = 0
        get() {
            return  field
        }
        set(value) {
            if (value>0)field=value
        }

}

//fun copyAddress()

fun  copyAddress(address: Address):Address{

    return  address



}

fun main() {
    var a:Address= Address()
    println(a.isEmpty)
}