package com.ericho.androidjsdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView


class JavascriptActivity2 : AppCompatActivity() {
    lateinit var mWebView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_javascript)

        mWebView = findViewById(R.id.webview)
        val webSettings = mWebView.settings

        // 设置与Js交互的权限
        webSettings.javaScriptEnabled = true

        // 通过addJavascriptInterface()将Java对象映射到JS对象
        //参数1：Javascript对象名
        //参数2：Java对象名
        mWebView.addJavascriptInterface(AndroidtoJs(), "test")//AndroidtoJS类对象映射到js的test对象

        // 加载JS代码
        // 格式规定为:file:///android_asset/文件名.html
        mWebView.loadUrl("file:///android_asset/javascript-2.html")
    }
}