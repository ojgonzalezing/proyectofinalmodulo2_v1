package org.pfmod2.seres.animales;

import org.pfmod2.seres.Servivo;

public abstract class Animal extends Servivo {

    private double velocidadAnimal;
    private double alimentacionAnimal;

    public Animal(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean esComestible, double velocidadAnimal, double alimentacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, esComestible);
        this.velocidadAnimal = velocidadAnimal;
        this.alimentacionAnimal = alimentacionAnimal;
    }


    public double obtenerVelocidadAnimal() {
        return velocidadAnimal;
    }

    public void establecerVelocidadAnimal(double velocidadAnimal) {
        this.velocidadAnimal = velocidadAnimal;
    }

    public double obtenerAlimentacionAnimal() {
        return alimentacionAnimal;
    }

    public void establecerAlimentacionAnimal(double alimentacionAnimal) {
        this.alimentacionAnimal = alimentacionAnimal;
    }

}
