package com.example.lw_szyf_3020004.kotlinlearn.prototype_pattern

public abstract class Shape : Cloneable {

    lateinit var id: String;

    open   lateinit var type: String;


    override fun clone(): Any {
        return super.clone()
    }


    abstract fun draw()


}