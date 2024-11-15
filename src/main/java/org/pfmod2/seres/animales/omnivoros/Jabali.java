package org.pfmod2.seres.animales.omnivoros;

import org.pfmod2.seres.SerVivo;
import org.pfmod2.ubicaciones.Ubicacion;

public class Jabali extends Omnivoro{
    public Jabali(int idSerVivo, int idUbicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, idUbicacion, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }

    @Override
    public void comer(SerVivo presa) {

    }

    @Override
    public int desplazarse() {
        return 0;
    }
}
