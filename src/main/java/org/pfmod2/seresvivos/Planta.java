package org.pfmod2.seresvivos;

public class Planta extends SerVivo {

    public Planta(int id, double vida, double peso, int idLocalidad, String especie) {
        super(id, vida, peso, idLocalidad, especie);
    }

    @Override
    public void desplazarSerVivo(Integer idLocalidad) {
        System.out.println(String.format("Este es un objeto tipo de planta: %s, por lo tanto no se desplaza", this.obtenerId()));
    }

    @Override
    public void reproducirSerVivo(SerVivo pareja) {

    }
}

