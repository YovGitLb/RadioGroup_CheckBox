package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class actividad2 extends AppCompatActivity {

    String nom = "", precio = "", dscto1 = "", dscto2 = "", curso = "";
    //creamos el objeto de tipo boton
    Button btn2;
    //declaramos un objeto de tipo imagen
    ImageView img1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        Bundle recupera = getIntent().getExtras();
        if (recupera != null) {
            nom = recupera.getString("dato1");
            precio = recupera.getString("dato2");
            dscto1 = recupera.getString("dato3");
            dscto2 = recupera.getString("dato4");
            curso = recupera.getString("dato5");
        }
        TextView mensaje1 = (TextView) findViewById(R.id.txtn1);
        TextView mensaje2 = (TextView) findViewById(R.id.txtn2);
        TextView mensaje3 = (TextView) findViewById(R.id.txtn3);
        TextView mensaje4 = (TextView) findViewById(R.id.txtn4);
        TextView mensaje5 = (TextView) findViewById(R.id.txtn5);
        mensaje1.setText("Nombre: " + nom);
        mensaje2.setText("Precio: " + precio);
        mensaje3.setText("Dscto1: " + dscto1);
        mensaje4.setText("Dscto2: " + dscto2);
        mensaje5.setText("Curso: " + curso);
        //declaramos un imgview para poder asignarle la imagen respectiva
        img1 = (ImageView) findViewById(R.id.imageView1);
        int foto = 0;
        if (curso.equals("Php")) {
            foto = R.drawable.actualizar;
            img1.setImageResource(foto);
        } else if (curso.equals("Sql")) {
            foto = R.drawable.eliminar;
            img1.setImageResource(foto);
        } else if (curso.equals("MySql")) {
            foto = R.drawable.guardar;
            img1.setImageResource(foto);
        }


    }


    public void onClick(View v) {
        finish();
    }
}
