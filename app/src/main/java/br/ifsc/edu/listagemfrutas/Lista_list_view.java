package br.ifsc.edu.listagemfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Lista_list_view extends AppCompatActivity {
    ListView listFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listFrutas = findViewById(R.id.listViewFrutas);

        Frutas frutas = new Frutas();

        final ArrayList<Fruta> listaFrutas = new ArrayList<>();
        for (Fruta fruta : frutas.FRUTAS) {
            listaFrutas.add(fruta);
        }
        FrutasAdapter adapter = new FrutasAdapter(this, R.layout.activity_list_view, listaFrutas);

        listFrutas.setAdapter(adapter);

    }
}

