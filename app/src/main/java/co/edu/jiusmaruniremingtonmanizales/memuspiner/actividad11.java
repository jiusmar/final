package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class actividad11 extends AppCompatActivity implements View.OnClickListener{

    EditText valor1,valor2;
    Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad11);

        boton1 =(Button)findViewById(R.id.button1);
        valor1 = (EditText) findViewById(R.id.editText);
        valor2 = (EditText) findViewById(R.id.editText1);


        boton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String variable1 = valor1.getText().toString();
        String variable2 = valor2.getText().toString();


        if(variable1.equals("admin")  && variable2.equals("admin")){
            Intent intent11 = new Intent(actividad11.this, MainActivity.class);
            startActivity(intent11);
        }
        else {

            Toast.makeText(actividad11.this, "El usuario o la clave no corresponde", Toast.LENGTH_SHORT).show();
        }
    }
}