package com.example.lanchonetetialu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CardapioActivity extends AppCompatActivity implements CarrinhoObserver {
    private CarrinhoObservable carrinhoObservable;
    private CheckBox checkBoxTilapia;
    private CheckBox checkBoxBife;
    private CheckBox checkBoxMacarronada;
    private CheckBox checkBoxGalinhada;
    private CheckBox checkBoxFeijoada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        carrinhoObservable = new CarrinhoObservable();
        carrinhoObservable.addObserver(this);

        checkBoxTilapia = findViewById(R.id.checkBoxTilapia);
        checkBoxBife = findViewById(R.id.checkBoxBife);
        checkBoxMacarronada = findViewById(R.id.checkBoxMacarrao);
        checkBoxGalinhada = findViewById(R.id.checkBoxGalinhada);
        checkBoxFeijoada = findViewById(R.id.checkBoxFeijoada);
    }

    public void adicionarAoCarrinho(View view) {
        ArrayList<String> itensSelecionados = new ArrayList<>();
        if (checkBoxTilapia.isChecked()) {
            itensSelecionados.add(checkBoxTilapia.getText().toString());
        }
        if (checkBoxBife.isChecked()) {
            itensSelecionados.add(checkBoxBife.getText().toString());
        }
        if (checkBoxMacarronada.isChecked()) {
            itensSelecionados.add(checkBoxMacarronada.getText().toString());
        }
        if (checkBoxGalinhada.isChecked()) {
            itensSelecionados.add(checkBoxGalinhada.getText().toString());
        }
        if (checkBoxFeijoada.isChecked()) {
            itensSelecionados.add(checkBoxFeijoada.getText().toString());
        }

        carrinhoObservable.notifyObservers(itensSelecionados);
    }

    @Override
    public void update(ArrayList<String> itensSelecionados) {
        Intent intent = new Intent(this, CarrinhoActivity.class);
        intent.putStringArrayListExtra("itensSelecionados", itensSelecionados);
        startActivity(intent);
    }
}