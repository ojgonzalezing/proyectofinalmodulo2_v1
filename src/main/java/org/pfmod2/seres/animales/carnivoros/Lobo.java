package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.seres.animales.Animal;
import org.pfmod2.ubicaciones.Ubicacion;

public class Lobo extends Carnivoro{
    public Lobo(int idSerVivo, int idUbicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, idUbicacion, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }

    @Override
    public boolean esComestible() {
        return false;
    }

    @Override
    public void comerAnimal(Animal presa) {

    }

    @Override
    public Ubicacion desplazarse() {
        return null;
    }
}
