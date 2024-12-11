package org.pfmod2.seres.animales;

import org.pfmod2.seres.Servivo;

public abstract class Animal extends Servivo {

    private double velocidadAnimal;
    private double alimenatacionAnimal;

    public Animal(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean comestible, double velocidadAnimal, double alimenatacionAnimal) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion, comestible);
        this.velocidadAnimal = velocidadAnimal;
        this.alimenatacionAnimal = alimenatacionAnimal;
    }


    public double getVelocidadAnimal() {
        return velocidadAnimal;
    }

    public void setVelocidadAnimal(double velocidadAnimal) {
        this.velocidadAnimal = velocidadAnimal;
    }

    public double getAlimenatacionAnimal() {
        return alimenatacionAnimal;
    }

    public void setAlimenatacionAnimal(double alimenatacionAnimal) {
        this.alimenatacionAnimal = alimenatacionAnimal;
    }

}
