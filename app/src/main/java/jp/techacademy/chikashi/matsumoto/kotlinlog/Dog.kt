package jp.techacademy.chikashi.matsumoto.kotlinlog/*
package jp.techacademy.chikashi.matsumoto.kotlinlog

import android.util.Log

open class Dog : Animal, Movable {
    // プロパティ
//    var name: String
//    var age: Int


    // 引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age) {}
//    {
//        this.name = name
//        this.age = age
//    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}*/
