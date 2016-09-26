package com.yolimaandrea.punto2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        RadioButton rButtonSuma = (RadioButton) findViewById(R.id.rButtonSuma);
        RadioButton rButtonResta= (RadioButton) findViewById(R.id.rButtonResta);
        RadioButton rButtonMulti= (RadioButton) findViewById(R.id.rButtonMulti);
        RadioButton rButtonDiv=(RadioButton) findViewById(R.id.rButtonDiv);
        final TextView tvresultado = (TextView) findViewById(R.id.textViewResultado);

        rButtonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double aux1 = Integer.valueOf(et1.getText().toString());
                double aux2 = Integer.valueOf(et2.getText().toString());
                double resultado = aux1 + aux2;
                tvresultado.setText("El resultado es " + resultado);
            }
        });
        rButtonResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double aux1 = Integer.valueOf(et1.getText().toString());
                double aux2 = Integer.valueOf(et2.getText().toString());
                double resultado = aux1 - aux2;
                tvresultado.setText("El resultado es " + resultado);

            }
        });
        rButtonMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double aux1 = Integer.valueOf(et1.getText().toString());
                double aux2 = Integer.valueOf(et2.getText().toString());
                double resultado = aux1 * aux2;
                tvresultado.setText("El resultado es " + resultado);

            }
        });
        rButtonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double aux1 = Integer.valueOf(et1.getText().toString());
                double aux2 = Integer.valueOf(et2.getText().toString());
                double resultado = aux1 / aux2;
                tvresultado.setText("El resultado es " + resultado);

            }
        });

    }

}

