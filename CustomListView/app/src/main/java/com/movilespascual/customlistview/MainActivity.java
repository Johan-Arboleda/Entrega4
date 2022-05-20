package com.movilespascual.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Entity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int[] idImagen = {
                R.drawable.img,
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5,
        };

        String[] nombre = {
               "Juan Camilo",
               "Jean Paul",
                "Craig",
                "Mike",
                "Ivana",
                "Michelle Molina"
        };

        String[] ultimoMensaje ={
                "Hey", "What´s Up","Nos vemos hoy?","Qué haces?","Wie heist du?","Gotta go"
        };

        String[] horaUltimoMensaje ={
                "10:30", "20:50","00:01","03:44","10:45","13:56"
        };
        String[] numeroTelefono ={
                "2222", "33344","89764","8765243","908765","12989"
        };

        String[] pais ={
                "Colombia", "USA","Colombia","Perú","Alemania","Suiza"
        };




        ListAdapter listAdapter = new ListAdapter(MainActivity.this, nombre,ultimoMensaje,horaUltimoMensaje,numeroTelefono,pais,idImagen);
        lista = (ListView) findViewById(R.id.listaView);

        lista.setAdapter(listAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(MainActivity.this, SegundaVista.class);
                intent.putExtra("Nombre",nombre[i]);
                intent.putExtra("Hora",horaUltimoMensaje[i]);
                intent.putExtra("tel",numeroTelefono[i]);
                intent.putExtra("msm",ultimoMensaje[i]);
                intent.putExtra("pais",pais[i]);
                intent.putExtra("img",idImagen[i]);
                startActivity(intent);
            }
        });



    }

}