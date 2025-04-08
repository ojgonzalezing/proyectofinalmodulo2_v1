package org.pfmod2.seresvivos;

public class Omnivoro extends SerVivo {
    private int velocidad;
    private double alimentacion;

    public Omnivoro(int id, double vida, double peso, int idLocalidad, String especie, int velocidad, double alimentacion) {
        super(id, vida, peso, idLocalidad, especie);
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }

    public void establecerVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double obtenerAlimentacion() {
        return alimentacion;
    }

    public void establecerAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }

}
