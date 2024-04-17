package com.example.lanchonetetialu;

public class ComentarioPrioritarioDecorator extends ComentarioDecorator {
    public ComentarioPrioritarioDecorator(Comentario comentario) {
        super(comentario);
    }

    @Override
    public String getDescricao() {
        return "PRIORITÁRIA: " + super.getDescricao();
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}
