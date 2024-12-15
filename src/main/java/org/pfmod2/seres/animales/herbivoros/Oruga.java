package org.pfmod2.seres.animales.herbivoros;

public class Oruga extends Herbivoro{
    public Oruga(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean esComestible, double velocidadAnimal, double alimentacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, esComestible, velocidadAnimal, alimentacionAnimal);
    }


    @Override
    public void desplazarse(int idUbicacion) {
        this.establecerIdUbicacion(idUbicacion);
    }
}
