package org.pfmod2.seres.animales.omnivoros;

import org.pfmod2.seres.animales.Animal;

public abstract class Omnivoro extends Animal {
    public Omnivoro(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean esComestible, double velocidadAnimal, double alimentacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, esComestible, velocidadAnimal, alimentacionAnimal);
    }

    @Override
    public void desplazarse(int idUbicacion) {
        this.establecerIdUbicacion(idUbicacion);
    }
}
