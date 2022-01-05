package com.example.toolshop;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class WebActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);
        webView.loadUrl("https://www.google.lk/search?hl=en&tbm=isch&source=hp&ei=Kk8qYL-bONaA9QPUhpjwCg&q=tools&oq=tools&gs_lcp=ChJtb2JpbGUtZ3dzLXdpei1pbWcQAzIFCAAQsQMyCAgAELEDEIMBMgIIADICCAAyAggAUOIcWOggYKAjaABwAHgAgAHJAYgBqAaSAQUwLjQuMZgBAKABAbABAA&sclient=mobile-gws-wiz-img");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();

        }
    }
}