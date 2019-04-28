package com.example.lw_szyf_3020004.kotlinlearn.construct

import java.sql.DriverManager.println


/**
 * that code in initializer blocks effectively becomes part of the primary constructor.
 * Delegation to the primary constructor happens as the first statement of a secondary constructor,
 * so the code in all initializer blocks is executed before the secondary constructor body. Even if the class has no primary constructor,
 * the delegation still happens implicitly, and the initializer blocks are still executed:
 */
class Constructors {
    init {
        println("Init block");
    }

    constructor(i:Int){
        println("constructor")

    }
}