package org.pfmod2.utilidades;

import org.pfmod2.seresvivos.SerVivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Inicializador {

    private static ArrayList<Integer> localidades;
    private static HashMap<String,Integer> cantidadPorEspecie;

    public static void crearLocalidades() {
        Random randomLocalidades = new Random();
        localidades = new ArrayList<>();
        for(int aCounter = 0; aCounter < randomLocalidades.nextInt(0, 16); aCounter++) {
            localidades.add(aCounter);
        }
    }

    public static void establecerCantidadPorEspecie() {
        Random randomPorEspecie = new Random();
        cantidadPorEspecie = new HashMap<>();
        for(Especies especie: Especies.values()) {
            cantidadPorEspecie.put(especie.toString(), randomPorEspecie.nextInt(1, especie.obtenerNumeroMaximo()+1));
        }
    }

    public static void listarCantidadPorEspecie() {
        int aCounter=0;
        for(Especies especie: Especies.values()) {
            System.out.println(String.format("Especie: %s - Cantidad: %d",especie.obtenerNombreFormal(),cantidadPorEspecie.get(especie.toString())));
        }
    }
}
