package org.pfmod2;

import org.pfmod2.seresvivos.SerVivo;
import org.pfmod2.utilidades.Desplazable;
import org.pfmod2.utilidades.Especies;
import org.pfmod2.utilidades.Inicializador;

import java.util.ArrayList;
import java.util.Random;

public class Isla{

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
}
