
package org.pfmod2.seres;

import org.pfmod2.ubicaciones.Ubicacion;

public abstract class SerVivo {
    protected int idSerVivo;
    protected int idUbicacion;
    protected double pesoSerVivo;
    protected boolean estaVivo;
    public SerVivo(int idSerVivo, int idUbicacion, double pesoSerVivo, boolean estaVivo) {
        this.idSerVivo = idSerVivo;
        this.idUbicacion = idUbicacion;
        this.pesoSerVivo = pesoSerVivo;
        this.estaVivo = estaVivo;
    }
    public int getIdSerVivo(){
        return this.idSerVivo;
    }
    public void setIdSerVivo(int idSerVivo){
        this.idSerVivo = idSerVivo;
    }
    public double getPesoSerVivo(){
        return this.pesoSerVivo;
    }
    public void setPesoSerVivo(double pesoSerVivo){
        this.pesoSerVivo = pesoSerVivo;
    }
    public boolean getEstaVivo(){
        return this.estaVivo;
    }
    public void setEstaVivo(boolean estaVivo){
        this.estaVivo = estaVivo;
    }

    public int getIdUbicacion() {
        return this.idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }


}