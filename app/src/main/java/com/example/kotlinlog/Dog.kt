package com.example.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {
    // property
//    var name: String
//    var age: Int

    // constructor
    constructor(name: String, age: Int):super (name, age) {

    }


    /* or you could write like:
    class Dog(var name: String, var age:Int){
    init{
    does the same as constructor()
    }
    }


     */

    // method
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
        Log.d("kotlintest", "the dog's name is " + this.name)
        Log.d("kotlintest", "the dog is " + this.age + " years old")
    }

    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}