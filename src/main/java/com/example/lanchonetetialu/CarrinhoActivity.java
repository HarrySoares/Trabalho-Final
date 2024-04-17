package com.example.lanchonetetialu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CarrinhoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        RecyclerView recyclerViewItens = findViewById(R.id.recyclerViewItens);
        recyclerViewItens.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> itensSelecionados = getIntent().getStringArrayListExtra("itensSelecionados");
        CarrinhoAdapter adapter = new CarrinhoAdapter(itensSelecionados);
        recyclerViewItens.setAdapter(adapter);
    }
}