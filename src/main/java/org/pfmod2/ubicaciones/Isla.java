package org.pfmod2.ubicaciones;

import org.pfmod2.seres.SerVivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isla {

    private static final String NOMBRE_ISLA = "La isla de la Infantasia";
    private static HashMap<Integer, Ubicacion> ubicaciones;
    private static HashMap<Integer, SerVivo> seresvivos;

    public Isla(HashMap<Integer, Ubicacion> ubicaciones, HashMap<Integer, SerVivo> seresvivos) {
        this.ubicaciones = ubicaciones;
        this.seresvivos = seresvivos;
    }

    public static void imprimirSeresVivos(){
        for (Map.Entry<Integer, SerVivo> serVivoEntry:seresvivos.entrySet()){
            System.out.println("IdSerVivo -> " +serVivoEntry.getKey() + ", Objeto -> " + serVivoEntry.getValue() + ", idUbicacion -> " +
                    serVivoEntry.getValue().getIdUbicacion());
        }
    }

    public static void imprimirUbicaciones(){
        ubicaciones.forEach((key, value) ->{
            System.out.println(String.format("IdUbicacion -> %d, SeresVivos -> %d", key, seresvivos.entrySet().stream().
                    filter(serVivo -> serVivo.getValue().getIdUbicacion() == key).count()));
        });
    }

}

