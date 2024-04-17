package com.example.lanchonetetialu;

public class PagamentoPayPal implements MetodoPagamento{
    @Override
    public String processarPagamento(double valor) {
        return "PayPal de valor: " + valor;
    }
}
