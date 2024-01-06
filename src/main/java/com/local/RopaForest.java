package com.local;

public class RopaForest implements Ropa{

    @Override
    public void render() {
        System.out.println("Mostrando ropa forest");
    }

    @Override
    public void usar() {
        System.out.println("Usando ropa forest");
    }

    @Override
    public String toString() {
        return "Ropa tipo City";
    }
    
}
