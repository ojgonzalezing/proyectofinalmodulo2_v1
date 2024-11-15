package org.pfmod2.seres.animales;

import org.pfmod2.seres.SerVivo;
import org.pfmod2.ubicaciones.Ubicacion;

public abstract class Animal extends SerVivo implements Comestible, Desplazable {

    protected double velocidadAnimal;
    protected double alimentacionAnimal;
    protected boolean comestible;

    public Animal(int idSerVivo, int idUbicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, idUbicacion, pesoSerVivo, estaVivo);
        this.velocidadAnimal = velocidadAnimal;
        this.alimentacionAnimal = alimentacionAnimal;
        this.comestible = comestible;

    }


    public double getVelocidadAnimal(){
        return this.velocidadAnimal;
    }

    public void setVelocidadAnimal(double velocidadAnimal){
        this.velocidadAnimal = velocidadAnimal;
    }

    public double getAlimentacionAnimal(){
        return this.alimentacionAnimal;
    }

    public void setAlimentacionAnimal(double alimentacionAnimal){
        this.alimentacionAnimal = alimentacionAnimal;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }
}
