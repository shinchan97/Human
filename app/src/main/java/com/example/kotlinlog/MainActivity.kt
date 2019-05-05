package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private fun total(first:Int, last:Int): Int{
        var sum =0
        for (i in first.until(last)){
            sum += i
        }
        return sum
        //Log.d("kotlintest", sum.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("Arata", 22, "YouTube")
        human.say()
        human.think()

        /*
        val dog = Dog("wulfy", 7)
        dog.say()
        val dog1 = Dog("hachi", 10)
        dog1.say()
        val dog2 = BigDog("pochi", 9)
        dog2.say()
        dog2.move()
        */


//       // create variable num and put 10 in
//        val num1 = 10*4+20
//
//        if (num1>=90){
//            Log.d("kotlintest", "execellent")
//        }
//        else if (num1>=75){
//            Log.d("kotlintest", "good")
//        }
//        else if (num1>=60) {
//            Log.d("kotlintest", "okay")
//        }
//        else {
//            Log.d("kotlintest", "bad")
//        }
//        val drink =1
//        when (drink) {
//            0 -> Log.d("kotlintest", "ordered coffee")
//            1 -> Log.d("kotlintest", "ordered tea")
//            2 -> Log.d("kotlintest", "ordered juice")
//        }
//
//        for (i in 0 until 10) {
//            Log.d("kotlintest", "for loop " + i + " th")
//        }
//
//        for (i in 0.until(10) step 3) {
//            Log.d("kotlintest", "for loop " + i + " th")
//        }
//        // in and .. は演算子
//        // until, downTo, stepは関数
//
//        var num =1
//        while (num<6){
//            Log.d("kotlintest", "while loop " + num +" th")
//            num++
//        }
//
//        val points = arrayOf(10, 6, 15, 23, 17)
//        for (i in points){
//            Log.d("kotlintest", i.toString())
//            Log.d("kotlintest", Integer.toString(points.size))
//        }
//
//        val score = Array(5, {i -> (i*i)})
//        for (i in score.indices){
//            Log.d("kotlintest", score[3].toString())
//        }
//
//        val numb1 = 100
//        val numb2 = 0
//        var ans = 0
//
//        try{
//            ans = numb1/numb2
//        } catch (e: Exception){
//            Log.d("kotlintest", "tried to divide a number by 0")
//            Log.d("kotlintest", e.message)
//        } finally{
//            Log.d("kotlintest", "ans = " + ans.toString())
//        }
//
//        val a = total(1, 101)
//        Log.d("kotlintest", a.toString())
//
//
//
    }
}
