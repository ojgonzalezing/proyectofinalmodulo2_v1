package org.pfmod2.seresvivos;

import org.pfmod2.utilidades.Desplazable;
import org.pfmod2.utilidades.Reproducible;

public abstract class SerVivo implements Desplazable, Reproducible {
    private int id;
    private double vida;
    private double peso;
    private int idLocalidad;
    private String especie;

    public SerVivo(int id, double vida, double peso, int idLocalidad, String especie) {
        this.id = id;
        this.vida = vida;
        this.peso = peso;
        this.idLocalidad = idLocalidad;
        this.especie = especie;
    }

    public int obtenerId() {
        return id;
    }

    public void establecerId(int id) {
        this.id = id;
    }

    public double obtenerVida() {
        return vida;
    }

    public void establecerVida(double vida) {
        this.vida = vida;
    }

    public double obtenerPeso() {
        return peso;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    public int obtenerIdLocalidad() {
        return idLocalidad;
    }

    public void estableceridLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String obtenerEspecie() {
        return especie;
    }

    public void establecerEspecie(String especie) {
        this.especie = especie;
    }
}
