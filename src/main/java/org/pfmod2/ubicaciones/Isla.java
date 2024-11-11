package org.pfmod2.ubicaciones;

import java.util.ArrayList;
import java.util.List;

public class Isla {

    private static final String NOMBRE_ISLA = "La isla de la Infantasia";
    private List<Ubicacion> ubicaciones;

    public Isla(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public List<Ubicacion> retornarUbicaciones(){
        return this.ubicaciones;
    }
}

