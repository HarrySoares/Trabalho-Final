package com.example.lanchonetetialu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CarrinhoAdapter extends RecyclerView.Adapter<CarrinhoAdapter.ViewHolder> {
    private ArrayList<String> itensSelecionados;

    public CarrinhoAdapter(ArrayList<String> itensSelecionados) {
        this.itensSelecionados = itensSelecionados;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_carrinho, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindItem(itensSelecionados.get(position));
    }

    @Override
    public int getItemCount() {
        return itensSelecionados.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewItem = itemView.findViewById(R.id.textViewItem);
        }

        public void bindItem(String item) {
            textViewItem.setText(item);
        }
    }
}