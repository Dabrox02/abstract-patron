package com.local;

public class Main {
    public static void main(String[] args) {
        String gameEnvironment = "forest";

        PersonajeFactory personajeFactory;

        // Crear la fábrica según el entorno del juego
        switch (gameEnvironment) {
            case "forest":
                personajeFactory = new ForestAbstractFactory();
                break;
            case "city":
                personajeFactory = new CityAbstractFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid game environment");
        }

        Personaje personaje = new Personaje(personajeFactory);
        personaje.crearPersonaje();
    }
}