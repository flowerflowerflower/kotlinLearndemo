package com.example.lw_szyf_3020004.kotlinlearn.construct

class 妹子(override var 性格:String,override var 长相:String,override var 声音:String):人(性格, 长相, 声音)


class 汉子(override var 性格: String, override var 长相: String, override var 声音: String): 人(性格,长相,声音)


open class 人(open var 性格:String,open var 长相:String,open var 声音:String){

    init{
        println("new   :：$性格,长想：$长相,声音：$声音")
    }
}

fun getName():String?{

    return null
}

fun main(args: Array<String>) {
    val 我喜欢妹子:妹子 = 妹子("we","甜美","动人")

    val name=getName()
    val names:String= getName()?:return
    println(name?.length)
    val value:String?="hellow"
    println(value!!.length)

}
