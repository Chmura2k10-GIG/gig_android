package com.gig.gig.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.gig.gig.R;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://reactjs.org/docs/hello-world.html");
        myWebView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed()
    {
        if(myWebView.canGoBack())
        {
            myWebView.goBack();
        }
        else super.onBackPressed();
    }

}
