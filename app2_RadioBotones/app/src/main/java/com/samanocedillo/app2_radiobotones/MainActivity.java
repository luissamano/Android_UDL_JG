package com.samanocedillo.app2_radiobotones;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    RadioButton r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);

    }

    public void calcular(View view) {

        int nro1 = Integer.parseInt((et1.getText().toString()));
        int nro2 = Integer.parseInt((et2.getText().toString()));

        if (r1.isChecked() == true) {
            int suma = nro1 + nro2;
            tv1.setText(String.valueOf(suma));
        }
        else if (r2.isChecked() == true) {
            int resta = nro1 - nro2;
            tv1.setText(String.valueOf(resta));
        }
        else {

        }
    }



}
