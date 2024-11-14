package org.pfmod2.seres;

import org.pfmod2.ubicaciones.Ubicacion;

public class Planta extends SerVivo{
    public Planta(int idSerVivo, Ubicacion ubicacion, double pesoSerVivo, boolean estaVivo) {
        super(idSerVivo, ubicacion, pesoSerVivo, estaVivo);
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
}
