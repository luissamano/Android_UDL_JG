package com.samanocedillo.app4_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);
        spinner = (Spinner)findViewById(R.id.spinner);

        String []string = {"Sumar","Restar","Multiplicar","Dividir"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, string);
        spinner.setAdapter(adapter);

    }

    public void calcular(View view)
    {
        int nro1 = Integer.parseInt(et1.getText().toString());
        int nro2 = Integer.parseInt(et2.getText().toString());

        String selec = spinner.getSelectedItem().toString();

        if (selec.equals("Sumar"))
        {
            int suma = nro1 + nro2;
            tv1.setText(String.valueOf(suma));
        }
        else if (selec.equals("Restar"))
        {
            int suma = nro1 - nro2;
            tv1.setText(String.valueOf(suma));
        }
        else if (selec.equals("Multiplicar"))
        {
            int suma = nro1 * nro2;
            tv1.setText(String.valueOf(suma));
        }
        else if (selec.equals("Dividir"))
        {
            int suma = nro1 / nro2;
            tv1.setText(String.valueOf(suma));
        }
    }

}
