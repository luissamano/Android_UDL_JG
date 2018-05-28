package com.samanocedillo.app1_evento_boton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);

    }

    public void sumar(View view){

        int nro1 = Integer.parseInt(et1.getText().toString());
        int nro2 = Integer.parseInt(et2.getText().toString());
        int suma = nro1 + nro2;
        tv1.setText(String.valueOf(suma));

    }
}
