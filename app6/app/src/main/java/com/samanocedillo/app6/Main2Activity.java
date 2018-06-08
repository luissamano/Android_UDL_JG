package com.samanocedillo.app6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView =(TextView)findViewById(R.id.textView);
    }

    public void llamada (View view)
    {
        textView.setText("Llamando... Espera Por Favor");
    }

    public void view1 (View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
