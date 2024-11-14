package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.seres.animales.Animal;
import org.pfmod2.ubicaciones.Ubicacion;

public class Lobo extends Carnivoro{
    public Lobo(int idSerVivo, Ubicacion ubicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, ubicacion, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }

    @Override
    public double getVelocidadAnimal() {
        return 0;
    }

    @Override
    public void setVelocidadAnimal(double velocidadAnimal) {

    }

    @Override
    public double getAlimentacionAnimal() {
        return 0;
    }

    @Override
    public void setAlimentacionAnimal(double alimentacionAnimal) {

    }

    @Override
    public void setComestible(boolean comestible) {

    }

    @Override
    public int getIdSerVivo() {
        return 0;
    }

    @Override
    public void setIdSerVivo(int idSerVivo) {

    }

    @Override
    public double getPesoSerVivo() {
        return 0;
    }

    @Override
    public void setPesoSerVivo(double pesoSerVivo) {

    }

    @Override
    public boolean getEstaVivo() {
        return false;
    }

    @Override
    public void setEstaVivo(boolean estaVivo) {

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
