package org.pfmod2.seres;

public class Planta extends SerVivo{
    public Planta(int idSerVivo, double pesoSerVivo, boolean estaVivo) {
        super(idSerVivo, pesoSerVivo, estaVivo);
    }

    @Override
    public int getIdSerVivo() {
        return this.idSerVivo;
    }

    @Override
    public void setIdSerVivo(int idSerVivo) {
        this.idSerVivo = idSerVivo;
    }

    @Override
    public double getPesoSerVivo() {
        return this.pesoSerVivo;
    }

    @Override
    public void setPesoSerVivo(double pesoSerVivo) {
        this.pesoSerVivo = pesoSerVivo;
    }

    @Override
    public boolean getEstaVivo() {
        return this.estaVivo;
    }

    @Override
    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}
