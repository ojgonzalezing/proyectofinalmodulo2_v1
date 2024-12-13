package org.pfmod2.ubicaciones;

import org.pfmod2.seres.Servivo;
import org.pfmod2.seres.animales.Animal;
import org.pfmod2.seres.animales.carnivoros.Lobo;

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

    public Servivo obtenerServivo(int idServivo){
        return (Servivo) this.seresvivos.stream().filter(servivo -> idServivo == servivo.obtenerIdServivo());
    }

}
