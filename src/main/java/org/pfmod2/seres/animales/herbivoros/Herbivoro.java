package org.pfmod2.seres.animales.herbivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Herbivoro extends Animal {
    public Herbivoro(int idSerVivo, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }
}
