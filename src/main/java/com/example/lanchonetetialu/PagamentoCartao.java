package com.example.lanchonetetialu;

public class PagamentoCartao implements MetodoPagamento{
    @Override
    public String processarPagamento(double valor) {
        return "Cartão de crédito valor: "+valor;
    }
}
