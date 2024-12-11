package org.pfmod2.seres;

public abstract class Servivo {

    private int idServivo;
    private double pesoServivo;
    private boolean estaVivo;
    private int idUbicacion;
    private boolean comestible;

    public Servivo(int idServivo, double pesoServivo, boolean estaVivo, int idUbicacion, boolean comestible){
        this.setIdServivo(idServivo);
        this.setPesoServivo(pesoServivo);
        this.setEstaVivo(estaVivo);
        this.setIdUbicacion(idUbicacion);
        this.comestible = comestible;
    }
    public double getPesoServivo(){
        return this.pesoServivo;
    }

    public void setPesoServivo(double pesoServivo){
        this.pesoServivo = pesoServivo;
    }

    public int getIdServivo(){
        return this.idServivo;
    }

    public void setIdServivo(int idServivo){
        this.idServivo = idServivo;
    }

    public boolean getEstaVivo(){
        return this.estaVivo;
    }

    public void setEstaVivo(boolean estaVivo){
        this.estaVivo = estaVivo;
    }

    public int getIdUbicacion(){
        return this.idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion){
        this.idUbicacion = idUbicacion;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }
    
    public void setComestible(boolean comestible){
        this.comestible = comestible;
    }
    
    public boolean getComestible(){
        return this.comestible;
    }
}
