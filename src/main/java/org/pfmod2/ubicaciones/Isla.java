package org.pfmod2.ubicaciones;

import org.pfmod2.seres.Servivo;

import java.util.ArrayList;

public class Isla {

    private final static String NOMBRE_ISLA ="Isla de la Supervivencia";
    private ArrayList<Ubicacion> ubicaciones;

    public Isla(ArrayList<Ubicacion> ubicaciones){
        this.ubicaciones = ubicaciones;
    }

    public void setUbicaciones(ArrayList<Ubicacion> ubicaciones){
        this.ubicaciones = ubicaciones;
    }

    public ArrayList<Ubicacion> getUbicaciones(){
        return this.ubicaciones;
    }
}
