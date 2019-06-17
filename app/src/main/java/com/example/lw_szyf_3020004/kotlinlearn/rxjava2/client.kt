package com.example.lw_szyf_3020004.kotlinlearn.rxjava2

import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.internal.schedulers.IoScheduler
import io.reactivex.internal.schedulers.NewThreadScheduler


fun main(){
    val a=Observable.create<String>(){
        System.out.println()
        it.onNext("1")
        it.onNext("2")
        it.onComplete()
    }

   val b= a.observeOn(NewThreadScheduler()).flatMap {
       System.out.println(Thread.currentThread().name)
       Observable.just(it+"11")
   }.filter() {
       var flag=false;
       when {
           it.length>0->flag=false
           else -> flag=true
       }
      flag
   }.observeOn(NewThreadScheduler()).subscribe {

       System.out.println(it)
   }




}