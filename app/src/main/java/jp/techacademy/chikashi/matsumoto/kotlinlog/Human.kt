package jp.techacademy.chikashi.matsumoto.kotlinlog

import android.util.Log

/*
* Humanクラス
* */
open class Human : Animal, Thinkable {

    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {}

    //自己紹介
    override fun say() {
        Log.d(
            "kotlintest",
            "私の名前は" + this.name + "です。年は" + this.age + "歳です。"
        )
    }

    //趣味
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}