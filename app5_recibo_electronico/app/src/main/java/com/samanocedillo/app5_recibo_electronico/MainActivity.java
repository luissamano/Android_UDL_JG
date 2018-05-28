package com.samanocedillo.app5_recibo_electronico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Spinner spinner;
    private TextView tv1,tv2,tv3,tv4,tv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText)findViewById(R.id.et1);
        et2 =(EditText)findViewById(R.id.et2);

        spinner=(Spinner)findViewById(R.id.spinner);

        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv3 =(TextView)findViewById(R.id.tv3);
        tv4 =(TextView)findViewById(R.id.tv4);
        tv5 =(TextView)findViewById(R.id.tv5);

        String []string = {"A","B","C","D"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, string);
        spinner.setAdapter(adapter);

    }


    public void calcular (View  view) {

        int nro1 = Integer.parseInt(et1.getText().toString());
        int nro2 = Integer.parseInt(et2.getText().toString());
        int kw = nro2 - nro1;
        double precio = 0.0;
        double importe = 0.0;
        double desc = 0.0;
        double neto = 0.0;
        double p = 0.0;

        String selec = spinner.getSelectedItem().toString();

        if (selec.equals("A")) {
            precio = 0.33;
            importe = precio * kw;
        } else if (selec.equals("B")) {
            precio = 0.8;
            importe = precio * kw;
        } else if (selec.equals("C")) {
             precio = 1.5;
            importe = precio * kw;
        } else if (selec.equals("D")) {
            precio = 2;
            importe = precio * kw;
        }

        if (kw < 100) {
            desc = 0.10;
        }

        p = importe * desc;
        neto = importe - p;


        tv1.setText(kw+ "Kw");
        tv2.setText("$" +String.valueOf(precio));
        tv3.setText("$" +String.valueOf(importe));
        tv4.setText(String.valueOf(desc * 100)+ "%");
        tv5.setText("$" +String.valueOf(neto));
    }
}
