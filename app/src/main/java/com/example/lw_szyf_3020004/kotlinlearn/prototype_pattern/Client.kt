package com.example.lw_szyf_3020004.kotlinlearn.prototype_pattern

public class Rectangle(override var type: String="Rectangle") : Shape() {

    override fun draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }


}


public class Circle(override var type: String="Circle") : Shape() {
    override fun draw() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main() {

    val a=Rectangle()
    a.id="1"




}