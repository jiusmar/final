package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class actividad10 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad10);
        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.uniremington.edu.co/procesos-de-admision/admisiones.html");
    }

}
