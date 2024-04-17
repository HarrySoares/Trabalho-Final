package com.example.lanchonetetialu;

import android.content.Context;
import android.content.Intent;

class CadastroFactory implements TelaFactory {
    @Override
    public Intent criarTela(Context context) {
        return new Intent(context, CadastroActivity.class);
    }
}