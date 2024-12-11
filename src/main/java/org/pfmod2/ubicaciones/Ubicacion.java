package org.pfmod2.ubicaciones;

import org.pfmod2.seres.Servivo;

import java.util.ArrayList;

public class Ubicacion {

    private int idUbicacion;
    private ArrayList<Servivo> seresvivos;

    public Ubicacion(int idUbicacion){
        this.idUbicacion = idUbicacion;
    }

    public void agregarSerVivo(Servivo servivo){
        this.seresvivos.add(servivo);
    }
}
