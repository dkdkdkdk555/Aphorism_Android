package com.example.aphorismproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private BroadcastReceiver mReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);


        setContentView(R.layout.activity_main);
        //WebView의 참조값 얻어오기
        WebView webView = findViewById(R.id.webView);
        //WebView 설정 객체 얻어오기
        WebSettings ws = webView.getSettings();
        //javascript 해석 가능하도록 설정
        ws.setJavaScriptEnabled(true);
        //WebView클라이언트 객체를 생성해서 넣어주기
        webView.setWebViewClient(new WebViewClient());
        //원하는 url로딩시키기
        webView.loadUrl("secret");

        mReceiver = new MyReceiver();
    }

    @Override
    protected void onResume(){
        Log.e("알람", "onResume()" );
        super.onResume();
    }
    @Override
    protected void onPause(){
        Log.e("알람", "onPause()" );
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("알람", "onStop()" );
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.e("알람", " onDestroy()" );
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Log.e("알람", "onStart()" );
        super.onStart();
    }
}