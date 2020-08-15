package com.example.coroutinesexplination

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    val TAG = "Main"

    //this video covers well all of that
    //https://www.youtube.com/watch?v=ShNhJ3wMpvQ&list=PLQkwcJG4YTCQcFEPuYGuv54nYai_lwil_

    //Basically coroutines are lightWeight "threads", many coroutines can live in a thread and they can be paused, restored and change threads and context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //globalScopeNotAsync()
        //globalScopeAndNoJoin()
        //globalScopeAndWithJoin()
        globalScopeAsyncDeferred()

        next_activity.setOnClickListener {
            //This runs the whole app no matter what
            eternalGlobalScope()
            //this also leaks
            otherScope()

            //this does not
            myLifeCicleScope()



            GlobalScope.launch {
                delay(5000)
                Intent(this@MainActivity, secondActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }
    }

    // a suspend fun is just a function that can be paused and then resumed
    suspend fun networkCall1() : String{
        delay(3000)
        return "Result1"
    }

    suspend fun networkCall2() : String{
        delay(3500)
        return "Result2"
    }

    fun doWhenRequestFinish(result1 : String?, result2: String?) {
        println("Results were: $result1  +  $result2")
        text_view_test.text = "Results were: $result1  +  $result2"
    }

    fun globalScopeAndNoJoin(){
        //global scope means that the coroutine will be global or will live all the app time
        //Even if activity is destroyed the coroutine stills alive


        //without join the texts passed are null and it does not executes well
        GlobalScope.launch(Dispatchers.IO) {
            val time = measureTimeMillis {
                var answer : String? = null
                var answer2 : String? = null

                val job1 = launch {
                    answer = networkCall1()
                }

                val job2 = launch {
                    answer2 = networkCall2()
                }
                //we change the context to main because we need to update the UI
                withContext(Dispatchers.Main){
                    doWhenRequestFinish(answer,answer2)
                }
            }
            Log.d(TAG,"time taken $time")
        }
    }

    fun globalScopeAndWithJoin(){
        //global scope means that the coroutine will be global or will live all the app time
        //Even if activity is destroyed the coroutine stills alive

        //without join the texts passed are null and it does not executes well

        /// NOTE****** DON'T DO IT LIKE THIS ON PRODUCTION, THIS IS ONLY FOR EXPLANATION
        GlobalScope.launch(Dispatchers.IO) {
            val time = measureTimeMillis {
                var answer : String? = null
                var answer2 : String? = null

                // this way we launch two different coroutines that works asyncrony

                val job1 = launch {
                   // if(isActive){
                        answer = networkCall1()
                    //}
                }

                val job2 = launch {
                    answer2 = networkCall2()
                }

                // .join() suspends the coroutine until its completed that ways it behaves like secuencial code
                job1.join() // if a comment this, only job2 gets result because job2 is quicker than job 1
              //  job1.cancel() //we can cancel jobs and we must check on the job if it is cancelled
                job2.join()
                withContext(Dispatchers.Main){
                    doWhenRequestFinish(answer,answer2)
                }
            }
            Log.d(TAG,"time taken $time")
        }
    }

    fun globalScopeNotAsync(){
        //global scope means that the coroutine will be global or will live all the app time

        //without join the texts passed are null and it does not executes well

        /// NOTE****** DON'T DO IT LIKE THIS ON PRODUCTION, THIS IS ONLY FOR EXPLANATION
        GlobalScope.launch(Dispatchers.IO) {
            val time = measureTimeMillis {
                var answer : String? = null
                var answer2 : String? = null

                // this way we do it sincro way and answer 2 only executes when we finish answer1
                answer = networkCall1()

                answer2 = networkCall2()

                withContext(Dispatchers.Main){
                    doWhenRequestFinish(answer,answer2)
                }
            }
            Log.d(TAG,"time taken $time")
        }
    }

    fun globalScopeAsyncDeferred(){

        //global scope means that the coroutine will be global or will live all the app time
        //Even if activity is destroyed the coroutine stills alive

        //without join the texts passed are null and it does not executes well

        /// NOTE****** DON'T DO IT LIKE THIS ON PRODUCTION, THIS IS ONLY FOR EXPLANATION
        GlobalScope.launch(Dispatchers.IO) {
            val time = measureTimeMillis {

               // Deferred value is a non-blocking cancellable future — it is a Job with a result. like a promise

                // one approach
                val answer = async { networkCall1() }
                val answer2 = async { networkCall2() }

                withContext(Dispatchers.Main){
                    doWhenRequestFinish(answer.await(),answer2.await())
                }

                // other approach but with context only changes the context of the coroutine but uses the same one
                // does not create a new one so if you want simultaneous results (ASYNC) use async await otherwise use withContext

                //https://stackoverflow.com/questions/50230466/kotlin-withcontext-vs-async-await

                /*
                If multiple tasks have to happen in parallel and final result depends on completion of all of them, then use async.

                For returning the result of a single task, use withContext.*/

               /* val answer = withContext(Dispatchers.IO) { networkCall1() }
                val answer2 = withContext(Dispatchers.IO) { networkCall2() }

                withContext(Dispatchers.Main){
                    doWhenRequestFinish(answer,answer2)
                }*/
            }
            Log.d(TAG,"time taken $time")
        }
    }

    fun eternalGlobalScope(){
        GlobalScope.launch {
            while (true){
                delay(1000)
                Log.d(TAG, "Coroutine global scope still active")
            }
        }
    }

    fun myLifeCicleScope(){
        //viewModelScope exists and is alive while a viewModel is alive
        lifecycleScope.launch {
            while (true){
                delay(1000)
                Log.d(TAG, "Coroutine LifeCycle scope still active")
            }
        }
    }

    fun otherScope() {
        //viewModelScope exists and is alive while a viewModel is alive
        CoroutineScope(IO).launch {
            while (true) {
                delay(1000)
                Log.d(TAG, "Coroutine another scope still active")
            }
        }
    }
}
