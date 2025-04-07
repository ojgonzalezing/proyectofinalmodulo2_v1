package org.pfmod2.utilidades;

import org.pfmod2.seresvivos.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Inicializador {

    private static ArrayList<Integer> localidades;
    private static HashMap<String,Integer> cantidadPorEspecie;

    public static void crearLocalidades() {
        /* Este metodo inicializa la variable localidades, la cual será un atributo de cada uno de los Seres vivos de la simulacion*/
        Random randomLocalidades = new Random();
        localidades = new ArrayList<>();
        for(int aCounter = 0; aCounter < randomLocalidades.nextInt(0, 16); aCounter++) {
            localidades.add(aCounter);
        }
    }

    public static void establecerCantidadPorEspecie() {
        /* Metodo a invocar iterando sobre cada uno de las localidades ya creadas
        * Inicializara un numero de seres vivos por especie para cada una de las localidades*/
        Random randomPorEspecie = new Random();
        cantidadPorEspecie = new HashMap<>();
        for(Especies especie: Especies.values()) {
            cantidadPorEspecie.put(especie.obtenerEspecie(), randomPorEspecie.nextInt(1, especie.obtenerNumeroMaximo()+1));
        }
    }

    public static SerVivo crearSerVivo(Integer idLocalidad, String especie) {
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
}
