package com.example.lanchonetetialu;

import android.content.Context;
import android.content.Intent;

class ComentarioFactory implements TelaFactory {
    @Override
    public Intent criarTela(Context context) {
        return new Intent(context, ComentariosActivity.class);
    }
}