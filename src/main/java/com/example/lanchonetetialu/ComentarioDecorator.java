package com.example.lanchonetetialu;

public abstract class ComentarioDecorator implements Comentario {
    protected Comentario comentario;

    public ComentarioDecorator(Comentario comentario) {
        this.comentario = comentario;
    }

    @Override
    public String getDescricao() {
        return comentario.getDescricao();
    }
}