package com.lostsidedead.a3dbreakout

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import android.content.pm.ActivityInfo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main) // Correct usage for XML layout
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://lostsidedead.biz/3DPong")
    }
}