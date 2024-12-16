package org.pfmod2.ubicaciones;

import org.pfmod2.Inicializador;
import org.pfmod2.seres.Servivo;
import org.pfmod2.seres.animales.Animal;

import java.util.ArrayList;
import java.util.Random;

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

    public static void desplazarAnimal(){
        ubicaciones.forEach(ubicacion -> {
            int idUbicacion = ubicacion.obtenerIdUbicacion();
            ArrayList<Servivo> seresvivos = ubicacion.obtenerSeresVivos();
            seresvivos.forEach(servivo -> {
                Random randomOperacionesLocales = new Random();
                boolean blRandomComfirmaDesplazamiento = randomOperacionesLocales.nextBoolean();
                if(blRandomComfirmaDesplazamiento){
                    int intRandomNuevaUbicacion = randomOperacionesLocales.nextInt(ubicaciones.size());
                    System.out.println(String.format("El AnimalID: %d se desplazara de la UbicacionID: %d a la UbicacionID: %d", servivo.obtenerIdServivo(), servivo.obtenerIdUbicacion(), intRandomNuevaUbicacion));
                    ubicaciones.get(intRandomNuevaUbicacion).agregarSerVivo(servivo);
                    ubicacion.removerSerVivo(ubicacion.obtenerServivo(servivo.obtenerIdServivo()));;
                }else {
                    System.out.println(String.format("El AnimalID: %d no se desplazara de ubicacion",servivo.obtenerIdServivo()));
                }
            });
        });
    }

}
