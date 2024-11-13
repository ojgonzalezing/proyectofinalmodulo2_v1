package org.pfmod2.ubicaciones;

import org.pfmod2.seres.SerVivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Isla {

    private static final String NOMBRE_ISLA = "La isla de la Infantasia";
    private static List<Ubicacion> ubicaciones;
    private static HashMap<SerVivo, Ubicacion> ubicacionSerVivo;

    public Isla(List<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public static List<Ubicacion> retornarUbicaciones(){
        return ubicaciones;
    }

    public void imprimeUbicaciones(){
        for(Ubicacion ubicacion:ubicaciones){
            System.out.println(ubicacion);
        }
    }
}

