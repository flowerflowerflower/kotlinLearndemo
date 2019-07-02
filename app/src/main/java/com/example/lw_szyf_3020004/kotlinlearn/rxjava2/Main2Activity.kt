package com.example.lw_szyf_3020004.kotlinlearn.rxjava2

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import com.example.lw_szyf_3020004.kotlinlearn.R
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.BiFunction
import io.reactivex.functions.Consumer
import io.reactivex.functions.Function
import io.reactivex.internal.schedulers.IoScheduler
import io.reactivex.internal.schedulers.NewThreadScheduler



class Main2Activity : AppCompatActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        Log.e("Main2Activity",Thread.currentThread().name)

        val a= Observable.create<String>(){

            Log.e("Main2Activity",Thread.currentThread().name)
            it.onNext("1")
            Log.e("Main2Activity","onNext")
            it.onNext("2")
            it.onNext("3")
            it.onNext("4")
            it.onNext("5")
            it.onNext("6")
            it.onNext("7")
            it.onComplete()
        }.subscribeOn(IoScheduler())

        val j= Observable.create<String>(){

            Log.e("Main2Activity",Thread.currentThread().name)
            it.onNext("1")
            Log.e("Main2Activity","onNext")
            it.onNext("2")
            it.onNext("3")
            it.onNext("4")
            it.onNext("5")
            it.onNext("6")
            it.onNext("7")
            it.onComplete()
        }.subscribeOn(IoScheduler())


        a.repeatWhen(object:Function<Observable<in Throwable>,Observable<String>>{



            private val a:Int=3

            private val b:Int=0;

            override fun apply(t: Observable<in Throwable>): Observable<String> {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

                 return   Observable.just("dfdf")
            }
        })

//
//        Observable.zip<String,String,String>(a,j, BiFunction { t1, t2 ->
//            Log.e("Main2Activity",Thread.currentThread().name+":"+t1+t2)
//            t1+t2
//        }).observeOn(IoScheduler()).subscribe({
//            Log.e("Main2Activity",Thread.currentThread().name)
//        },{
//            Log.e("Main2Activity",Thread.currentThread().name)
//        })

//        Observable.empty<String>().subscribe({
//            Log.e("result","end")
//        },{
//            Log.e("result","end")
//        },{
//            Log.e("result","end")
//        })



        val b= a.buffer(2,1).subscribeOn(IoScheduler()).observeOn(IoScheduler()).flatMap {
            Log.e("Main2Activity",Thread.currentThread().name+":"+it.toString())
            Thread.sleep(11000)
            Observable.just(it+"11")
        }.observeOn(IoScheduler()).subscribe {
            Thread.sleep(11000)
            Log.e("Main2Activity",Thread.currentThread().name+":end:" +
                    ""+it)
            println(it)
        }










//      var c=Flowable.fromCallable {
//            Log.e("Main2Activity",Thread.currentThread().name)
//            Thread.sleep(1000)
//            "Done"
//        }.isEmpty.subscribeOn(IoScheduler()).subscribe { t1, t2 ->
//          Log.e("Main2Activity",Thread.currentThread().name)
//      }





    }


//    Flowable.fromCallable(() -> {
//        Thread.sleep(1000); //  imitate expensive computation
//        return "Done";
//    })
//    .subscribeOn(Schedulers.io())
//    .observeOn(Schedulers.single())
//    .subscribe(System.out::println, Throwable::printStackTrace);
//
//    Thread.sleep(2000); // <--- wait for the flow to finish








}
