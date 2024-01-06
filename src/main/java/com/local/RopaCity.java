package com.local;

public class RopaCity implements Ropa {

    @Override
    public void render() {
        System.out.println("Mostrando ropa City");
    }

    @Override
    public void usar() {
        System.out.println("Usando ropa City");
    }


    @Override
    public String toString() {
        return "Ropa tipo City";
    }
    

}
