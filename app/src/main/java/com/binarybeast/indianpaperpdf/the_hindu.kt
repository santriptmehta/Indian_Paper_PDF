package com.binarybeast.indianpaperpdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class the_hindu : AppCompatActivity() {

    lateinit var E_webview : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_hindu)

        E_webview = findViewById(R.id.hindu_webview)

        E_webview.settings.javaScriptEnabled = true
        E_webview.settings.allowContentAccess = true
        E_webview.settings.domStorageEnabled = true
        E_webview.settings.useWideViewPort = true
        E_webview.settings.setAppCacheEnabled(true)

        E_webview.loadUrl("https://dailyepaper.in/the-hindu-pdf-epaper-download-19-oct-2021/")
        E_webview.webViewClient = web_view_controler()
    }
}