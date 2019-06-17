package com.example.lw_szyf_3020004.kotlinlearn.factory


public interface Icat {
    fun showColor()

}

public interface IFactory {

    fun createCat(): Icat
}


public class RedCat() : Icat {
    override fun showColor() {
        println("red")
    }
}


public class GreenCat() : Icat {

    override fun showColor() {
        println("green")
    }
}


public class RedCatFactory : IFactory {
    override fun createCat(): Icat {
        return RedCat()
    }
}


public class GreenCatFactory : IFactory {

    override fun createCat(): Icat {

        return GreenCat()
    }

}

/**
 * 可以使用反射相关的方法处理
 */


object name {

    fun getFactory(path: String): IFactory {

        val a = Class.forName(path) as Class
        return a.newInstance() as IFactory
    }

}

fun main() {
    name.getFactory("com.example.lw_szyf_3020004.kotlinlearn.factory.RedCatFactory").createCat().showColor()
}