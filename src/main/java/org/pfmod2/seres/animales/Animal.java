package org.pfmod2.seres.animales;

import org.pfmod2.seres.Servivo;

public abstract class Animal extends Servivo {

    private double velocidadAnimal;
    private double alimenatacionAnimal;
    private boolean comestible;

    public Animal(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, double velocidadAnimal, double alimenatacionAnimal, boolean comestible) {
        super(idServivo, pesoServivo, estaVivo, idUbicacion);
        this.velocidadAnimal = velocidadAnimal;
        this.alimenatacionAnimal = alimenatacionAnimal;
        this.comestible = comestible;
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

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }
}
