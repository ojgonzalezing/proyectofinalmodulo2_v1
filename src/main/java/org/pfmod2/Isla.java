package org.pfmod2;

import org.pfmod2.seresvivos.SerVivo;
import org.pfmod2.utilidades.Inicializador;

import java.util.ArrayList;

public class Isla{

    private static String nombreIsla = "La mas movida de las islas";
    private static ArrayList<SerVivo> seresvivos;

    {
        this.seresvivos = new ArrayList<>();
        Inicializador.crearLocalidades();
        seresvivos = Inicializador.inicializarSeresVivos();
    }


    public static void agregarServivo(SerVivo servivo) {
        seresvivos.add(servivo);
    }

    public static ArrayList<SerVivo> listarSeresVivos() {
        return seresvivos;
    }

    public SerVivo buscarServivoPorId(int id) {
        return seresvivos.stream().filter(serVivo -> serVivo.obtenerId() == id).findFirst().orElse(null);
    }

    public String obtenerNombreIsla() {
        return nombreIsla;
    }

}
