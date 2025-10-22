package seresvivos;

import utilidades.IComestible;

public class Herbivoro extends Animal implements IComestible {
    public Herbivoro(Long id, byte vida, short peso, byte ubicacion, byte veocidad, String raza) {
        super(id, vida, peso, ubicacion, veocidad, raza);
    }

    @Override
    public void comer(SerVivo presa) {
        if (presa instanceof Planta){
            // Continuar con el borrador de implementacion del metodo comer() de la interface IComestible
        }
    }
}
