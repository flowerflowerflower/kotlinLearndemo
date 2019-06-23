package com.example.lw_szyf_3020004.kotlinlearn.factory

import android.content.SharedPreferences


public interface Shape {
    fun draw()
}


public class Rectangle : Shape {
    override fun draw() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        System.out.println("Inside Rectangle::draw() method.")
    }
}

public class Square : Shape {
    override fun draw() {
        System.out.println("Inside Square::draw() method.")
    }
}

public interface Color {
    fun fill()
}


public class Red : Color {
    override fun fill() {
        System.out.println("Inside Red::fill() method.")
    }
}

public class green : Color {
    override fun fill() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


public abstract class AbstractFactory {

    public abstract fun getColor(color: String): Color?
    public abstract fun getShape(shap: String): Shape?
}


public class ShapeFactory : AbstractFactory() {
    override fun getColor(color: String): Color? {

        val colorObject = color.run {
            when (this) {
                "RED" -> Red()
                "green" -> green()
                else -> null
            }
        }
        return colorObject
    }

    override fun getShape(shap: String): Shape? {

        val shapObject: Shape? = shap.run {
            when (this) {
                "RECTANGLE" -> Rectangle()
                "SQUARE" -> Square()
                else -> null
            }
        }
        return shapObject
    }


}



























