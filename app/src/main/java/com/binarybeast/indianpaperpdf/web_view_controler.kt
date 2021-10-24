package com.binarybeast.indianpaperpdf

import android.webkit.WebView
import android.webkit.WebViewClient

class web_view_controler : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView,url: String): Boolean {
        view.loadUrl(url)
        return true
    }
}