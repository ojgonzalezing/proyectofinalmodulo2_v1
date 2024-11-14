package org.pfmod2.ubicaciones;

import org.pfmod2.seres.SerVivo;

import java.util.List;

public class Ubicacion {

    private int idUbicacion;
    private List<SerVivo> seresVivos;

    public Ubicacion(int idUbicacion){
        this.idUbicacion = idUbicacion;
    }

    public int getIdUbicacion() {
        return this.idUbicacion;
    }

    public List retornarListadoAnimales(){
        return this.seresVivos;
    }


}
