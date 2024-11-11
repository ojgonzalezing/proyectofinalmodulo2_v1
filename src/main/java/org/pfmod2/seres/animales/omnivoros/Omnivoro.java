package org.pfmod2.seres.animales.omnivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Omnivoro extends Animal {
    public Omnivoro(int idSerVivo, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }
}

