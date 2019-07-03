package com.example.lw_szyf_3020004.kotlinlearn.bridge


public interface DrawAPI {

    fun drawCircle(radius: Int, x: Int, y: Int)
}


public class RedCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}


abstract class Shape {
    protected lateinit var drawAPI: DrawAPI

    constructor(drawAPI: DrawAPI) {
        this.drawAPI = drawAPI
    }

    abstract fun draw()
}

public class Circle : Shape {

    var x = 0
    var y = 0
    var radius = 0
    override fun draw() {
        drawAPI.drawCircle(radius, x, y)
    }

    constructor(x: Int, y: Int, radius: Int, drawAPI: DrawAPI) : super(drawAPI) {
        this.x = x
        this.y = y
        this.radius = radius
    }
}


fun main() {

    val redCircle: Shape = Circle(100, 100, 0, RedCircle())
    redCircle.draw()
}











