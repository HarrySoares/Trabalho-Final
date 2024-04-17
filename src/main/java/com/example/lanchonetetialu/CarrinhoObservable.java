package com.example.lanchonetetialu;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoObservable {
    private List<CarrinhoObserver> observers = new ArrayList<>();

    public void addObserver(CarrinhoObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CarrinhoObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(ArrayList<String> itensSelecionados) {
        for (CarrinhoObserver observer : observers) {
            observer.update(itensSelecionados);
        }
    }
}