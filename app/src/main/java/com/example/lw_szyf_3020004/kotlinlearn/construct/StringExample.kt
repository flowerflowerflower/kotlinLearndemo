package com.example.lw_szyf_3020004.kotlinlearn.construct

val arrayOfInt:IntArray = intArrayOf(1,3,5,7)
val arrayOfChar:CharArray = charArrayOf('H','e')
val 书记宿主:Array<String> = arrayOf("dfdf")
/**

        */


fun main(args: Array<String>) {

    args.forEach{
     println(it)
    }

    args.forEach (::print)

    args.forEach ForEach@{
        if(it=="q")return ForEach@
        println()
    }



}

val sum={arg1:Int,ar2:Int ->

    arg1+ar2}

fun sum(arg1:Int,arg2:Int):Int{

   return  arg1+arg2

}


val int2Long= fun(x:Int):Long{
    return x.toLong()
}

//(Int)->Long