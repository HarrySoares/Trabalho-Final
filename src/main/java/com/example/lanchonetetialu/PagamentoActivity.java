package com.example.lanchonetetialu;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PagamentoActivity extends AppCompatActivity {

    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);
    }
    public void verificarPagamento(View v){
        radiogroup = findViewById(R.id.radioGroup);
        int selectedRadioButtonId = radiogroup.getCheckedRadioButtonId();

        if (selectedRadioButtonId != -1) {
            RadioButton radioButton = findViewById(selectedRadioButtonId);
            String escolha = radioButton.getText().toString();
            TextView t = findViewById(R.id.textView);
            switch (escolha){
                case "Pix":
                    PagamentoPix pix = new PagamentoPix();
                    t.setText(pix.processarPagamento(10));
                    break;
                case "Cartão de Crédito":
                    PagamentoCartao cartao = new PagamentoCartao();
                    t.setText(cartao.processarPagamento(10));
                    break;
                case "PayPal":
                    PagamentoPayPal paypal = new PagamentoPayPal();
                    t.setText(paypal.processarPagamento(10));
                    break;
                case "Cartão de Débito":
                    PagamentoCartaoDebito debito = new PagamentoCartaoDebito();
                    t.setText(debito.processarPagamento(10));
                    break;
            }
        } else {
            Toast.makeText(PagamentoActivity.this, "Por favor, selecione uma opção de pagamento.", Toast.LENGTH_SHORT).show();
        }
    }
}