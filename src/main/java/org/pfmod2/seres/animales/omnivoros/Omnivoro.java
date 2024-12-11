package org.pfmod2.seres.animales.omnivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Omnivoro extends Animal {
    public Omnivoro(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean comestible, double velocidadAnimal, double alimenatacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, comestible, velocidadAnimal, alimenatacionAnimal);
    }
}
