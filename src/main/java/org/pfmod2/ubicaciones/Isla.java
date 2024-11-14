package org.pfmod2.ubicaciones;

import org.pfmod2.seres.SerVivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Isla {

    private static final String NOMBRE_ISLA = "La isla de la Infantasia";
    private static HashMap<Integer, Ubicacion> ubicaciones;
    private static HashMap<Integer, SerVivo> seresvivos;

    public Isla(HashMap<Integer, Ubicacion> ubicaciones, HashMap<Integer, SerVivo> seresvivos) {
        this.ubicaciones = ubicaciones;
        this.seresvivos = seresvivos;
    }

}

