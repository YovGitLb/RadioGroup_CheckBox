package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    Button btn1;
     CheckBox chk1,chk2;
     EditText nombre;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.editText);
        btn1=(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rg=(RadioGroup) findViewById(R.id.radioGroup1);
                int precio=0;
                String curso="";
                double dscto1=0,dscto2=0,dsctf=0,total=0;
                if(rg.getCheckedRadioButtonId()==R.id.rd1){
                    precio=300;
                    curso="Php";
                }else if(rg.getCheckedRadioButtonId()==R.id.rd2){
                    precio=500;
                    curso="Sql";
                }else if(rg.getCheckedRadioButtonId()==R.id.rd3){
                    precio=500;
                    curso="MySql";
                }
                chk1=(CheckBox) findViewById(R.id.chk1);
                chk2=(CheckBox) findViewById(R.id.chk2);

                if(chk1.isChecked()){
                    dscto1=precio*0.05;
                }
                if(chk2.isChecked()){
                    dscto2=precio*0.1;
                }

                dsctf=dscto1+dscto2;
                total=precio-dsctf;
                Toast.makeText(getApplicationContext(), "curso: "+curso+"\n Precio: "+precio+"\n Dscto: "+dsctf+"\n total: "+total, Toast.LENGTH_LONG).show();

                //convertimos todas las variables numericas en texto pata enviarlas
                String texto1=nombre.getText().toString();
                String texto2=String.valueOf(precio);
                String texto3=String.valueOf(dscto1);
                String texto4=String.valueOf(dscto2);
                String texto5=curso;

                Intent i = new Intent (getApplicationContext(), actividad2.class);
                //como parametros le enviamos todas las variables de tipo string creados
                i.putExtra("dato1",texto1);
                i.putExtra("dato2", texto2);
                i.putExtra("dato3", texto3);
                i.putExtra("dato4", texto4);
                i.putExtra("dato5", texto5);
                //mostramos el segundo layout
                startActivity(i);


            }
        });

    }
}
