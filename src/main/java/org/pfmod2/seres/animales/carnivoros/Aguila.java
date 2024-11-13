package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.seres.animales.Animal;
import org.pfmod2.ubicaciones.Ubicacion;

public class Aguila extends Carnivoro{
    public Aguila(int idSerVivo, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }

    @Override
    public double getVelocidadAnimal() {
        return this.velocidadAnimal;
    }

    @Override
    public void setVelocidadAnimal(double velocidadAnimal) {
        this.velocidadAnimal = velocidadAnimal;
    }

    @Override
    public double getAlimentacionAnimal() {
        return this.alimentacionAnimal;
    }

    @Override
    public void setAlimentacionAnimal(double alimentacionAnimal) {
        this.alimentacionAnimal = alimentacionAnimal;
    }

    @Override
    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    @Override
    public int getIdSerVivo() {
        return this.idSerVivo;
    }

    @Override
    public void setIdSerVivo(int idSerVivo) {
        this.idSerVivo = idSerVivo;
    }

    @Override
    public double getPesoSerVivo() {
        return this.pesoSerVivo;
    }

    @Override
    public void setPesoSerVivo(double pesoSerVivo) {
        this.pesoSerVivo = pesoSerVivo;
    }

    @Override
    public boolean getEstaVivo() {
        return this.estaVivo;
    }

    @Override
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    @Override
    public boolean esComestible() {
        return this.comestible;
    }

    @Override
    public void comerAnimal(Animal presa) {
    }

    @Override
    public Ubicacion desplazarse(Ubicacion ubicacion) {
        return null;
    }
}
