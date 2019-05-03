package com.example.kotlinlog

import android.util.Log

open class Human : Animal, Thinkable {
    var hobby = "YouTube"

    // constructor
    constructor(name: String, age: Int): super (name, age)

    override fun say(){
        Log.d("kotlintest", "私の名前は"+ name + "です。歳は" + age + "歳です。")
    }

    override fun think(){
        Log.d("kotlintest", "私は" + hobby + "について考える。")

    }
}