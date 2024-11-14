package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.seres.animales.Animal;
import org.pfmod2.ubicaciones.Ubicacion;

public abstract class Carnivoro extends Animal {
    public Carnivoro(int idSerVivo, Ubicacion ubicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, ubicacion, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }
}
