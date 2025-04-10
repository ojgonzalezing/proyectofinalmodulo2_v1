package org.pfmod2.seresvivos;

import java.util.Random;

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

    @Override
    public void desplazarSerVivo(Integer idLocalidad) {
        Random randomDireccion = new Random();
        int intRandomDireccion = randomDireccion.nextInt(0, 2);
        int intDestino = 0;
        int intOrigen = this.ObteneridLocalidad();
        int intDesplazamiento = randomDireccion.nextInt(0, 5);
        switch (intRandomDireccion) {
            case 0:
                intDestino = intOrigen + intDesplazamiento;
                break;
            default:
                intDestino = intOrigen - intDesplazamiento;
                break;
        }
        if(intDestino < 0 || intDestino > 15){
            System.out.println(String.format("Ubicacion de destino no puede estar fuera de limites de la isla, no se desplaza SerVivo, se mantiene en ubicacion: %d", intOrigen));
        }else {
            System.out.println(String.format("Servivo id: %s, en %d se desplaza a -> ubicacion: %d",this.ObtenerId(), intOrigen, intDestino));
            this.estableceridLocalidad(intDestino);
        }
    }
}
