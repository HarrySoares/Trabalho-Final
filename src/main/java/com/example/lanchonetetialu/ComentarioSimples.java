package com.example.lanchonetetialu;

public class ComentarioSimples implements Comentario {
    private String descricao;

    public ComentarioSimples(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}