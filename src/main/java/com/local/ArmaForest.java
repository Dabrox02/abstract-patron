package com.local;

public class ArmaForest implements Arma {

    @Override
    public void render() {
        System.out.println("Mostrando arma forest");
    }

    @Override
    public void disparar() {
        System.out.println("Disparando arma forest");
    }

    @Override
    public String toString() {
        return "Arma tipo Forest";
    }
}
