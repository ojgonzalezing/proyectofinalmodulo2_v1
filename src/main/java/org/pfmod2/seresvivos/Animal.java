package org.pfmod2.seresvivos;

/*
* Clase abstracta Animal de la que extenderan extenderan cada una de las especies: Carnivoros, Herbivoros y Omnivoros
* Las especies se diferenciaraon en la forma en que implementan la interface Comestible.
* Posteriormente agregaré el atributo de nivel de alimentacion el cual será double
*/

public abstract class Animal extends SerVivo {

    protected byte veocidad;
    protected String raza;
    protected final String tipo = "Animal";

    public Animal(Long id, byte vida, short peso, byte ubicacion, byte veocidad, String raza){
        super(id, vida, peso, ubicacion, "Animal");
        this.veocidad = veocidad;
        this.raza = raza;

    }

    public byte getVeocidad() {
        return veocidad;
    }

    public void setVeocidad(byte veocidad) {
        this.veocidad = veocidad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }
}
