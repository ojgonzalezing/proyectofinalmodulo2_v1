package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Carnivoro extends Animal {
    public Carnivoro(int idSerVivo, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }

}
