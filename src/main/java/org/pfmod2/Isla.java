package org.pfmod2;

import org.pfmod2.seresvivos.SerVivo;

import java.util.ArrayList;

public class Isla {

    private static String nombreIsla = "La mas movida de las islas";
    private static ArrayList<SerVivo> seresvivos;

    {
        this.seresvivos = new ArrayList<>();
    }

    public static void agregarServivo(SerVivo servivo) {
        seresvivos.add(servivo);
    }

    public static ArrayList<SerVivo> listarSeeresVivos() {
        return seresvivos;
    }

    public static SerVivo buscarServivoPorId(int id) {
        return seresvivos.stream().filter(serVivo -> serVivo.getId() == id).findFirst().orElse(null);
    }

    public static String obtenerNombreIsla() {
        return nombreIsla;
    }
}
