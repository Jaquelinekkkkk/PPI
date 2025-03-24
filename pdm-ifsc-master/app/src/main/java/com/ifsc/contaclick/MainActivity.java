package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Integer i = 0;

    EditText edpeso, edaltura;
    TextView tvresultado;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edpeso = findViewById(R.id.edpeso);

        edaltura = findViewById(R.id.edaltura);

        tvresultado = findViewById(R.id.tvresultadoimc);

        buttonCalcular = findViewById(R.id.button);

        buttonCalcular.setOnClickListener(v -> {
            double peso, altura, imc;

            peso = Double.parseDouble(edpeso.getText().toString());
            altura= Double.parseDouble(edaltura.getText().toString());
            imc = peso/(altura*peso);

            tvresultado.setText(Double.toString(imc));

        });
    }






        TextView tv = findViewById(R.id.tvpeso);
        tv.setText(getString(R.string.app_name));

        Button b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(Integer.toString(i));
                i++;
            }
        });


    }
