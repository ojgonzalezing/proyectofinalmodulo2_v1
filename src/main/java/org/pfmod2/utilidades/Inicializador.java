package org.pfmod2.utilidades;

import org.pfmod2.seresvivos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Inicializador {

    private static ArrayList<Integer> localidades;

    public static void crearLocalidades() {
        /* Este metodo inicializa la variable localidades, la cual será un atributo de cada uno de los Seres vivos de la simulacion*/
        Random randomLocalidades = new Random();
        localidades = new ArrayList<>();
        for(int aCounter = 0; aCounter < randomLocalidades.nextInt(1, 16); aCounter++) {
            localidades.add(aCounter);
        }

    }

    public static HashMap<String, Integer> establecerCantidadPorEspecie() {
        /* Metodo a invocar iterando sobre cada uno de las localidades ya creadas
        * Inicializara un numero de seres vivos por especie para cada una de las localidades*/
        Random randomPorEspecie = new Random();
        HashMap<String,Integer> cantidadPorEspecie;
        cantidadPorEspecie = new HashMap<>();
        for(Especies especie: Especies.values()) {
            cantidadPorEspecie.put(especie.obtenerEspecie(), randomPorEspecie.nextInt(1, especie.obtenerNumeroMaximo()+1));
        }
        return cantidadPorEspecie;
    }


    public static SerVivo crearSerVivo(Integer idLocalidad, String especie) {
        /* Metodo para crear Objeto SerVivo dependiendo del parametro especie enviado desde la invocacion */
        Random randomIdSerVivo = new Random();
        int intRandomIdSerVivo = randomIdSerVivo.nextInt(Integer.MAX_VALUE);
        SerVivo serVivo = switch (especie){
            case "Lobo","Boa","Zorro","Oso","Aguila" -> {
                yield new Carnivoro(intRandomIdSerVivo,
                        100,
                        Especies.valueOf(especie.toUpperCase()).obtenerPeso(),
                        idLocalidad,
                        especie,
                        Especies.valueOf(especie.toUpperCase()).obtenerVelocidad(),
                        Especies.valueOf(especie.toUpperCase()).obtenerAlimentacion());
            }

            case "Caballo", "Ciervo", "Conejo","Cabra","Oveja","Bufalo","Oruga" -> {
                yield new Herbivoro(intRandomIdSerVivo,
                        100,
                        Especies.valueOf(especie.toUpperCase()).obtenerPeso(),
                        idLocalidad,
                        especie,
                        Especies.valueOf(especie.toUpperCase()).obtenerVelocidad(),
                        Especies.valueOf(especie.toUpperCase()).obtenerAlimentacion());
            }

            case "Raton", "Jabali", "Pato" -> {
                yield new Omnivoro(intRandomIdSerVivo,
                        100,
                        Especies.valueOf(especie.toUpperCase()).obtenerPeso(),
                        idLocalidad,
                        especie,
                        Especies.valueOf(especie.toUpperCase()).obtenerVelocidad(),
                        Especies.valueOf(especie.toUpperCase()).obtenerAlimentacion());
            }

            default -> {
                yield new Planta(intRandomIdSerVivo,
                        100,
                        Especies.valueOf(especie.toUpperCase()).obtenerPeso(),
                        idLocalidad,especie);
            }
        };
        return serVivo;
    }

    public static ArrayList<SerVivo> inicializarSeresVivos() {
        /* Metodo de inicializacion de ArrayList seresVivos, el cual será devuelto al objeto Isla*/
        ArrayList<SerVivo> seresVivos = new ArrayList<>();
        /* 1. Se recorre el ArrayList localidades*/
        System.out.println(String.format("Tamaño arreglo localidades: %d", localidades.size()));
        for(Integer localidad: localidades) {
            /* 2. Creacion de un HashMap cantidadPorEspecie el cual se utilizara establecer la poblacion por especie */
            HashMap<String,Integer> cantidadPorEspecie = establecerCantidadPorEspecie();
            for(String especie: cantidadPorEspecie.keySet()) {
                /* 3. Finalmente se poblara el ArrayList seresVivos con la cantidad de Seres Vivos por localidad*/
                for(int aCounter = 0; aCounter < cantidadPorEspecie.get(especie); aCounter++) {
                    seresVivos.add(crearSerVivo(localidad,especie));
                }
            }
        }
        return seresVivos;
    }
}
