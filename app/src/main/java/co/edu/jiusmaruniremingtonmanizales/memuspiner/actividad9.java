package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class actividad9 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad9);
        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.uniremington.edu.co/calendario-academico/calendario-academico-2017-1.html");
    }
}
