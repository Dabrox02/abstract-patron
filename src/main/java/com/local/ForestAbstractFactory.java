package com.local;

public class ForestAbstractFactory implements PersonajeFactory {

    @Override
    public Arma createArma() {
        return new ArmaForest();
    }

    @Override
    public Ropa createRopa() {
        return new RopaForest();
    }

}
