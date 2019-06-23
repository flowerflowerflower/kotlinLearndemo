package com.example.lw_szyf_3020004.kotlinlearn.rxjava

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.internal.schedulers.IoScheduler
import io.reactivex.internal.schedulers.NewThreadScheduler


fun main() {

   // val switcher= Ob
    val x= Observable.create<String> {
        System.out.println("Observable")
        System.out.println(Thread.currentThread().name)
        it.onNext("1")
        it.onNext("2")
        it.onNext("3")
        it.onNext("4")
        it.onComplete()
    }
   val b= Observable.just("on","off","on","on").filter {

       val a: Boolean?;
       if (it.equals("off")) {
           a = true
       } else {
           a = false
       }
       a

   }

    val kk = arrayOf("On", "Off", "On", "On")
    val c=Observable.fromArray(kk)






    x.observeOn(IoScheduler()).subscribe(object : Observer<String>{
        private var disposable:Disposable?= null
        override fun onComplete() {
           System.out.println("end")
        }

        override fun onSubscribe(d: Disposable) {
            disposable=d
            System.out.println(Thread.currentThread().name)
           System.out.println("onSubscribe")
        }

        override fun onError(e: Throwable) {

            System.out.println("onError")
        }

        override fun onNext(t: String) {
            System.out.println(Thread.currentThread().name)
            System.out.println("onNext"+t)
        }
    })













}