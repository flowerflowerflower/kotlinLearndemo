package com.example.lw_szyf_3020004.kotlinlearn.observer


/**
 * kotlin 学习内容观察者
 *
 */

public class Subject {

    private var observers: MutableList<Observer> = mutableListOf()


    public var state: Int = 0


    public fun attach(observer: Observer) {
        observers.add(observer)
    }


    public fun notifyAllObservers() {
        for (item in observers) {
            item.update()
        }
    }

}

public interface Observer {
    fun update()

}


public abstract class AbsObserver(private val subject: Subject) : Observer {


}


fun main() {

    val subject = Subject()

    subject.attach(object : AbsObserver(subject) {

        override fun update() {
            println("subkect" + subject.state)
        }
    })
    subject.notifyAllObservers()
}

