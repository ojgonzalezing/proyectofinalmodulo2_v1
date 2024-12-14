package org.pfmod2.ubicaciones;

import org.pfmod2.Inicializador;
import org.pfmod2.seres.Servivo;

import java.util.ArrayList;

public class Isla {

    private final static String NOMBRE_ISLA ="Isla de la Supervivencia";
    private static ArrayList<Ubicacion> ubicaciones;

    public static void establecerUbicaciones(){
        ubicaciones = Inicializador.incializarIsla();
    }

    public static void listarUbicaciones(){
        ubicaciones.forEach(ubicacion -> {
            System.out.println(ubicacion);
        });
    }


}
