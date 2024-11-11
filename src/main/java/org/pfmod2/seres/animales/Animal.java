package org.pfmod2.seres.animales;

import org.pfmod2.seres.SerVivo;

public abstract class Animal extends SerVivo implements Comestible {

    protected double velocidadAnimal;
    protected double alimentacionAnimal;
    protected boolean comestible;

    public Animal(int idSerVivo, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, pesoSerVivo, estaVivo);
        this.velocidadAnimal = velocidadAnimal;
        this.alimentacionAnimal = alimentacionAnimal;
        this.comestible = comestible;

    }


    public abstract double getVelocidadAnimal();

    public abstract void setVelocidadAnimal(double velocidadAnimal);

    public abstract double getAlimentacionAnimal();

    public abstract void setAlimentacionAnimal(double alimentacionAnimal);

    public abstract void setComestible(boolean comestible);
}
