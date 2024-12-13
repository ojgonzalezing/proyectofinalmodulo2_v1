package org.pfmod2.seres;

public abstract class Servivo {

    private int idServivo;
    private double pesoServivo;
    private boolean estaVivo;
    private int idUbicacion;
    private boolean esComestible;

    public Servivo(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean esComestible){
        this.establecerIdServivo(idServivo);
        this.establecerPesoServivo(pesoServivo);
        this.establecerEstaVivo(estaVivo);
        this.establecerIdUbicacion(idUbicacion);
        this.esComestible = esComestible;
    }
    public double obtenerPesoServivo(){
        return this.pesoServivo;
    }

    public void establecerPesoServivo(double pesoServivo){
        this.pesoServivo = pesoServivo;
    }

    public int obtenerIdServivo(){
        return this.idServivo;
    }

    public void establecerIdServivo(int idServivo){
        this.idServivo = idServivo;
    }

    public boolean obtenerEstaVivo(){
        return this.estaVivo;
    }

    public void establecerEstaVivo(boolean estaVivo){
        this.estaVivo = estaVivo;
    }

    public int obtenerIdUbicacion(){
        return this.idUbicacion;
    }

    public void establecerIdUbicacion(int idUbicacion){
        this.idUbicacion = idUbicacion;
    }

    public void establecerEsComestible(boolean esComestible){
        this.esComestible = esComestible;
    }
    
    public boolean obtenerEsComestible(){
        return this.esComestible;
    }
}
