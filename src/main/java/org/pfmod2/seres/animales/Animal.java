package org.pfmod2.seres.animales;

import org.pfmod2.seres.SerVivo;
import org.pfmod2.ubicaciones.Ubicacion;

public abstract class Animal extends SerVivo implements Comestible, Desplazable {

    protected double velocidadAnimal;
    protected double alimentacionAnimal;
    protected boolean comestible;

    public Animal(int idSerVivo, Ubicacion ubicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, ubicacion, pesoSerVivo, estaVivo);
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
