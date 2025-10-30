package org.pfmod2.seresvivos;

import org.pfmod2.utilidades.IComestible;

public class Herbivoro extends Animal {
    public Herbivoro(Long id, byte vida, short peso, byte ubicacion, byte veocidad, String raza) {
        super(id, vida, peso, ubicacion, veocidad, raza);
    }
}
