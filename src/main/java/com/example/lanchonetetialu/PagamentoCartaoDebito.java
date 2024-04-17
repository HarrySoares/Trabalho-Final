package com.example.lanchonetetialu;

public class PagamentoCartaoDebito implements MetodoPagamento{
    @Override
    public String processarPagamento(double valor) {
        return "Cartão de débito valor: "+valor;
    }
}
