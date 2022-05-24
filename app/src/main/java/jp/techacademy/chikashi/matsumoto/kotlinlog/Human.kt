package jp.techacademy.chikashi.matsumoto.kotlinlog

import android.util.Log

/*
* Humanクラス
* */
open class Human : Animal, Thinkable {

    //    メンバ変数としてString型変数hobbyを定義する。
    var hobby: String

    //    メンバ変数を初期化する。
    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby = hobby
    }

    //    自己紹介
    override fun say() {
        Log.d(
            "kotlintest",
            "私の名前は" + this.name + "です。年は" + this.age + "歳です。"
        )
    }

    //    趣味
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}