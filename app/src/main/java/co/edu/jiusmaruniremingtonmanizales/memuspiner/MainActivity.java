package co.edu.jiusmaruniremingtonmanizales.memuspiner;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner spinner, spinner0, spinner1, spinner2, spinner3;
    Button boton1, boton2, boton3;
    RadioGroup radio;
    RadioButton rboton1, rboton2, rboton3, rboton4, rboton5, rboton6, rboton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //trae al controlador la parte grafica del spinner
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner0 = (Spinner) findViewById(R.id.spinner0);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        boton3 = (Button) findViewById(R.id.button3);
        rboton1 = (RadioButton) findViewById(R.id.radioButton1);
        rboton2 = (RadioButton) findViewById(R.id.radioButton2);
        rboton3 = (RadioButton) findViewById(R.id.radioButton3);
        rboton4 = (RadioButton) findViewById(R.id.radioButton4);
        rboton5 = (RadioButton) findViewById(R.id.radioButton5);
        rboton6 = (RadioButton) findViewById(R.id.radioButton6);
        rboton7 = (RadioButton) findViewById(R.id.radioButton7);
        radio = (RadioGroup) findViewById(R.id.RadioGroup1);

        radiogroupListener();

        //se crea la matriz o la lista
        List list = new ArrayList();
        list.add("Estudiantes");
        list.add("Calendrio Academico");
        list.add("Tarifas Institucionales 2017");
        list.add("plataforma Moodle");
        list.add("Plataforma Q10");
        list.add("Correo Institucional");
        list.add("Recibo de Matricula");
        list.add("Homologaciones");
        list.add("Directorio Administrativo");
        list.add("Lineamientos Academícos");
        list.add("Reglamento Estudiantl");

        List list0 = new ArrayList();
        list0.add("Aspirantes");
        list0.add("Oferta Academica");
        list0.add("Formas de Pago");
        list0.add("Convenios y Descuentos");
        list0.add("Requisitos de Inscripcion");
        list0.add("Homologaciones");
        list0.add("tarifas Institucionales 2017");
        list0.add("Pre-Inscripción");
        list0.add("Documentos Nuevos");

        List list1 = new ArrayList();
        list1.add("Docentes - Tutores");
        list1.add("plataforma Moodle");
        list1.add("Plataforma Q10");
        list1.add("Correo Institucional");
        list1.add("Directorio Administrativo");
        list1.add("Reserva de Equipos");

        List list2 = new ArrayList();
        list2.add("Egresados");
        list2.add("Especializaciones");
        list2.add("Correo Institucional");
        list2.add("Directorio Administrativo");


        List list3 = new ArrayList();
        list3.add("Administrativos");
        list3.add("Plataforma Q10");
        list3.add("Correo Institucional");
        list3.add("Directorio Administrativo");
        list3.add("Reserva de Equipos");


        //se llena el array o matriz con un adaptador Array Adapter         el adaptador va a ser de 1 línea
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list0);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list1);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list2);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list3);

        //como se ve la lista
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter0.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // se hace la union de la lista con lo que hay en xml traiga el adaptaodr
        spinner.setAdapter(arrayAdapter);
        spinner0.setAdapter(arrayAdapter0);
        spinner1.setAdapter(arrayAdapter1);
        spinner2.setAdapter(arrayAdapter2);
        spinner3.setAdapter(arrayAdapter3);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);


        //cuando se seleccione algo, haga algo.  escucha el evento sobre la lista
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //se implementan 2 metodos @overrride
            @Override
            //cuando hay un item seleccionado entra a este método
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //cuando se toca cualquier elemento de la lista nos diga la posición
                Toast.makeText(MainActivity.this, "position " + String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            //cuando hay un item seleccionado entra a este método
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner0.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "position " + String.valueOf(spinner0.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "position " + String.valueOf(spinner1.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 1 ) {
                    Intent pasoALaActividadCuatro = new Intent(MainActivity.this, actividad4.class);
                    startActivity(pasoALaActividadCuatro);
                }

                Toast.makeText(MainActivity.this, "position " + String.valueOf(spinner2.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "position " + String.valueOf(spinner3.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(this, actividad1.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, actividad2.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, actividad3.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
    }

    protected void radiogroupListener() {
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {


                if (checkedId == R.id.radioButton1) {
                   Intent intent4 = new Intent(MainActivity.this, actividad4.class);
                    startActivity(intent4);
                }

                if (checkedId == R.id.radioButton1) {
                    Intent intent5 = new Intent(MainActivity.this, actividad5.class);
                    startActivity(intent5);
                }


            }
        });
    }



}