package com.local;

public class Personaje {

    private final PersonajeFactory personajeFactory;

    public Personaje(PersonajeFactory personajeFactory) {
        this.personajeFactory = personajeFactory;
    }

    public void crearPersonaje() {
        Ropa ropa = personajeFactory.createRopa();
        Arma arma = personajeFactory.createArma();

        System.out.println("Peronaje creado con " + arma + ", y " + ropa);
    }

}
