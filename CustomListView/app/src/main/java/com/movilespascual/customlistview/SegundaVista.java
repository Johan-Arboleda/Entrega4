package com.movilespascual.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class SegundaVista extends AppCompatActivity {
    ListAdapter lista;
    CircleImageView img;
    TextView Nombre, mensaje, horaUltimoMensaj,numeroTelefono,pais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_vista);

        Nombre= findViewById(R.id.text_Nombre);
        mensaje= findViewById(R.id.text_mensaje);
        horaUltimoMensaj=findViewById(R.id.text_Hora);
        numeroTelefono = findViewById(R.id.text_telefono);
        img=findViewById(R.id.img_perfil);

        Nombre.setText("Mensaje enviado por:"+" "+getIntent().getStringExtra("Nombre"));
        horaUltimoMensaj.setText("Hora del mensaje:"+" "+getIntent().getStringExtra("Hora")+" "+"Enviado desde: "+getIntent().getStringExtra("pais"));
        numeroTelefono.setText("Telefono de contacto: "+" "+getIntent().getStringExtra("tel"));
        mensaje.setText("Asunto:"+" "+getIntent().getStringExtra("msm"));
        img.setImageResource(getIntent().getIntExtra("img",R.drawable.img));


    }
}