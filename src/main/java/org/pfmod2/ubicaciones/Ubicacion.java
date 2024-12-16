package org.pfmod2.ubicaciones;

import org.pfmod2.seres.Servivo;
import org.pfmod2.seres.animales.Animal;
import org.pfmod2.seres.animales.carnivoros.Boa;
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

    public void removerSerVivo(Servivo servivo){
        this.seresvivos.remove(servivo);
    }

    public Servivo obtenerServivo(int idServivo){
        Servivo servivo = (Servivo) this.seresvivos.stream().filter(servivo1 -> servivo1.obtenerIdServivo() == idServivo);
         if(servivo instanceof Lobo){
             servivo = (Lobo) servivo;
         }

        if(servivo instanceof Boa){
            servivo = (Boa) servivo;
        }
        return servivo;
    }

    public ArrayList<Servivo> obtenerSeresVivos(){
        return this.seresvivos;
    }

    public int obtenerIdUbicacion(){
        return this.idUbicacion;
    }

}
