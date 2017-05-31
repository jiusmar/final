package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class actividad8 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad8);
        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.uniremington.edu.co/2015-09-29-14-56-59/presentacion.html");
    }
}
