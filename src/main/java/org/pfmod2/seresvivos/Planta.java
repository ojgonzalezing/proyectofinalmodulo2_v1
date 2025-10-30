package org.pfmod2.seresvivos;

public class Planta extends SerVivo{

    protected final String tipo = "Planta";
    public Planta(Long id, byte vida, short peso, byte ubicacion){
        super(id, vida, peso, ubicacion, "Planta");
    }

    public String getTipo() {
        return tipo;
    }

}
