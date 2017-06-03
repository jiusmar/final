package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class actividad14 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad14);
        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("https://www.q10academico.com/preinscripcion?aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
    }
}
