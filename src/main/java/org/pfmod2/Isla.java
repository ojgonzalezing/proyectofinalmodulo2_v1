package org.pfmod2;

import org.pfmod2.seresvivos.SerVivo;
import org.pfmod2.utilidades.Desplazable;
import org.pfmod2.utilidades.Especies;
import org.pfmod2.utilidades.Inicializador;

import java.util.ArrayList;
import java.util.Random;

public class Isla implements Desplazable{

    private static String nombreIsla = "La mas movida de las islas";
    private static ArrayList<SerVivo> seresvivos;

    {
        this.seresvivos = new ArrayList<>();
        Inicializador.crearLocalidades();
        seresvivos = Inicializador.inicializarSeresVivos();
    }


    public void agregarServivo(SerVivo servivo) {
        seresvivos.add(servivo);
    }

    public ArrayList<SerVivo> listarSeeresVivos() {
        return seresvivos;
    }

    public SerVivo buscarServivoPorId(int id) {
        return seresvivos.stream().filter(serVivo -> serVivo.ObtenerId() == id).findFirst().orElse(null);
    }

    public String obtenerNombreIsla() {
        return nombreIsla;
    }


    @Override
    public void desplazarSerVivo(SerVivo serVivo, Integer idLocalidad) {
        Random randomDesplazarSerVivo = new Random();
        int intRandomDesplazarSerVivo = randomDesplazarSerVivo.nextInt(0,Especies.valueOf(serVivo.ObtenerEspecie().toUpperCase()).obtenerVelocidad()+1);
        int intRandomDireccionSerVivo = randomDesplazarSerVivo.nextInt(0,2);
        int intLocalidadDestino = 0;
        if(intRandomDireccionSerVivo == 0){
            intLocalidadDestino = serVivo.ObteneridLocalidad() - intRandomDesplazarSerVivo;
        }
        if(intRandomDireccionSerVivo == 1){
            intLocalidadDestino = serVivo.ObteneridLocalidad() + intRandomDesplazarSerVivo;
        }

        /* Pendiente continuar con prototipo */
    }
}
