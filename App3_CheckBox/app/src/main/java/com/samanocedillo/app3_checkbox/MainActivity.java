package com.samanocedillo.app3_checkbox;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2;
    private TextView tv1;
    private CheckBox chb1, chb2;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        tv1 = (TextView) findViewById(R.id.tv1);
        chb1 = (CheckBox)findViewById(R.id.chb1);
        chb2 = (CheckBox)findViewById(R.id.chb2);

    }

    public void Calcular(View view) {
        int nro1 = Integer.parseInt(n1.getText().toString());
        int nro2 = Integer.parseInt(n2.getText().toString());

        String res = "";

        if (chb1.isChecked() == true)
        {
            int suma = nro1 + nro2;
            res = "\nLa suma es:"+suma;
        }
        else if (chb2.isChecked() == true)
        {
            int suma = nro1 - nro2;
            res = "\nLa resta es:"+suma;
        }
        else if (chb1.isChecked() == true && chb2.isChecked() == true)
        {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this.context);
            builder1.setMessage("Solo se puede hacer una operacion a la vez.");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }

        tv1.setText(res);
    }

}
