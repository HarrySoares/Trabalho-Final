package com.example.lanchonetetialu;

import android.content.Context;
import android.content.Intent;

interface TelaFactory {
    Intent criarTela(Context context);
}