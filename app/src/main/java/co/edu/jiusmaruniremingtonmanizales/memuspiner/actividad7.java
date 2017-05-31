package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class actividad7 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad7);
        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.uniremington.edu.co/gestion-documental/normas-internas-y-externas.html");
    }
}
