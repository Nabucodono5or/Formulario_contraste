package com.example.daenerys.formulario_contraste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Formulario_Acess extends AppCompatActivity {

    private ArrayList<String> listaEstado = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario__acess);

        Spinner spin1 = (Spinner) findViewById(R.id.spinner);

        listaEstado.add("Rio de Janeiro");
        listaEstado.add("Minas Gerais");
        listaEstado.add("São Paulo");
        listaEstado.add("Rio Grande do Sul");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaEstado);
        ArrayAdapter<String> spinnerArrayAdapter = arrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(spinnerArrayAdapter);
    }//onCreate

    public void contraste(View v){
        Intent e = new Intent(Formulario_Acess.this, Formulario.class);
        startActivity(e);
    }//contarste
}//class
