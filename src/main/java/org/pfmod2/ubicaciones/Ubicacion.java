package org.pfmod2.ubicaciones;

import org.pfmod2.seres.SerVivo;
import org.pfmod2.seres.animales.Animal;

import java.util.List;

public class Ubicacion {

    private int idUbicacion;
    private List<SerVivo> seresVivos;

    public Ubicacion(int idUbicacion, List<SerVivo> seresVivos){
        this.idUbicacion = idUbicacion;
        this.seresVivos = seresVivos;
    }

    public void listarUbicaciones() throws InterruptedException {

        System.out.println(String.format("Ubicacion Id: -> "+ this.idUbicacion + ", Cantidad animales es esta ubicacion -> %d", seresVivos.size()));
        /*for(SerVivo serVivo:seresVivos){
            System.out.println(serVivo);
        }*/

        Thread.sleep(1000);
    }
}
