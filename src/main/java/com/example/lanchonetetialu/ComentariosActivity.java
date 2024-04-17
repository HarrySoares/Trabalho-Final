package com.example.lanchonetetialu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ComentariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);

        List<Comentario> comentarios = new ArrayList<>();
        comentarios.add(new ComentarioSimples("Atendimento bom!"));
        comentarios.add(new ComentarioSimples("Comida saborosa!"));
        comentarios.add(new ComentarioSimples("Comida boa!!"));

        Comentario comentarioPrioritario = new ComentarioPrioritarioDecorator(new ComentarioSimples("Atendimento péssimo!"));
        comentarios.add(comentarioPrioritario);

        ArrayAdapter<Comentario> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, comentarios);
        ListView listViewComentarios = findViewById(R.id.listViewComentarios);
        listViewComentarios.setAdapter(adapter);
    }
}