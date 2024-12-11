package org.pfmod2.seres.animales.herbivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Herbivoro extends Animal {
    public Herbivoro(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean comestible, double velocidadAnimal, double alimenatacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, comestible, velocidadAnimal, alimenatacionAnimal);
    }
}
