package com.example.lw_szyf_3020004.kotlinlearn.construct


/**
 *  On the JVM,
 *  if all of the parameters of the primary constructor have default values,
 *  the compiler will generate an additional parameterless constructor which will use the default values.
 *  This makes it easier to use Kotlin with libraries such as Jackson or JPA that create class instances through parameterless constructors.
 */
class Customer (val customerName:String ="") {
}