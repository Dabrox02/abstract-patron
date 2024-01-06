package com.local;

public class CityAbstractFactory implements PersonajeFactory {

    @Override
    public Arma createArma() {
        return new ArmaCity();
    }

    @Override
    public Ropa createRopa() {
        return new RopaCity();
    }

}
