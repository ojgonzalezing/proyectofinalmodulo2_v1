package org.pfmod2.seresvivos;

public class Carnivoro extends SerVivo{
    private int velocidad;
    private double alimentacion;

    public Carnivoro(int id, double vida, double peso, int idLocalidad, String especie, int velocidad, double alimentacion) {
        super(id, vida, peso, idLocalidad, especie);
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double obtenerAlimentacion() {
        return alimentacion;
    }

    public void establecerAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }
}
