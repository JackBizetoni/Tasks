package jp.techacademy.chikashi.matsumoto.kotlinlog

import android.util.Log

open class Human : Animal, Thinkable {

    //名前と年齢
    constructor(name: String, age: Int) : super(name, age) {}
    //興味のあること
    var hobby: String = ""

    //自己紹介
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}