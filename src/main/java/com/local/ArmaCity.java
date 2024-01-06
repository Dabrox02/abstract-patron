package com.local;

public class ArmaCity implements Arma{

    @Override
    public void render() {
        System.out.println("Mostrando arma city");
    }

    @Override
    public void disparar() {
        System.out.println("Disparando arma city");
    }

    @Override
    public String toString() {
        return "Arma tipo City";
    }
}
