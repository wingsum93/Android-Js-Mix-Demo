package com.ericho.androidjsdemo

import android.webkit.JavascriptInterface


class AndroidtoJs : Any() {

    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    fun hello(msg: String) {
        println("JS调用了Android的hello方法")

        print(msg)


    }
}