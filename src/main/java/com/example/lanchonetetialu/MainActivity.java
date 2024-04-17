package com.example.lanchonetetialu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void iniciarTela(Context context, TelaFactory telaFactory) {
        Intent intent = telaFactory.criarTela(context);
        startActivity(intent);
    }

    public void irTelaPagamento(View view){
        iniciarTela(this, new PagamentoFactory());
    }
    public void irTelaCardapio(View view){
        iniciarTela(this, new CardapioFactory());
    }
    public void irTelaCadastro(View view){
        iniciarTela(this, new CadastroFactory());
    }
    public void irTelaComentarios(View view){
        iniciarTela(this, new ComentarioFactory());
    }
}