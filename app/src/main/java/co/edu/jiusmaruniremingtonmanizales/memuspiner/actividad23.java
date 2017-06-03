package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class actividad23 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad23);
        setContentView(R.layout.activity_actividad22); webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://reservas.uniremingtonmanizales.edu.co/login.php");
    }
}
