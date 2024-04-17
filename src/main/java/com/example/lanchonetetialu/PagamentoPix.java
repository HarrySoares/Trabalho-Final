package com.example.lanchonetetialu;

public class PagamentoPix implements MetodoPagamento{
    @Override
    public String processarPagamento(double valor) {
        return "Pix de valor: "+valor;
    }
}
