package org.pfmod2.ubicaciones;

import org.pfmod2.seres.Servivo;
import org.pfmod2.seres.animales.Animal;

import java.util.ArrayList;

public class Ubicacion {

    private int idUbicacion;
    private ArrayList<Servivo> seresvivos;

    public Ubicacion(int idUbicacion, ArrayList<Servivo> seresvivos){
        this.idUbicacion = idUbicacion;
        this.seresvivos = seresvivos;
    }

    public void agregarSerVivo(Servivo servivo){
        this.seresvivos.add(servivo);
    }

    public void imprimirSeresVivosUbicacion(){
        seresvivos.forEach(servivo -> {
            System.out.println(servivo);
        });
    }
}
