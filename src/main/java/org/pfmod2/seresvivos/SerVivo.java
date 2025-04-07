package org.pfmod2.seresvivos;

public abstract class SerVivo {
    private int id;
    private double vida;
    private double peso;
    private int idUbicacion;
    private String especie;

    public SerVivo(int id, double vida, double peso, int idUbicacion, String especie) {
        this.id = id;
        this.vida = vida;
        this.peso = peso;
        this.idUbicacion = idUbicacion;
        this.especie = especie;
    }

    public int ObtenerId() {
        return id;
    }

    public void establecerId(int id) {
        this.id = id;
    }

    public double ObtenerVida() {
        return vida;
    }

    public void establecerVida(double vida) {
        this.vida = vida;
    }

    public double ObtenerPeso() {
        return peso;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    public int ObtenerIdUbicacion() {
        return idUbicacion;
    }

    public void establecerIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String ObtenerEspecie() {
        return especie;
    }

    public void establecerEspecie(String especie) {
        this.especie = especie;
    }
}
