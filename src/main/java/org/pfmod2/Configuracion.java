package org.pfmod2;

import org.pfmod2.seres.Servivo;
import org.pfmod2.ubicaciones.Isla;
import org.pfmod2.ubicaciones.Ubicacion;

import java.util.*;

public class Configuracion {

    // Constantes
    public static final int LIMITE_UBICACIONES = 16;
    public static final int MAXIMO_SERES_UBICACION = 2545;
    public static final HashMap<Integer, Double> PESO_ANIMALES;
    public static final HashMap<Integer, Double> ALIMENTO_ANIMALES;
    public static final HashMap<Integer, Integer> MAXIMO_ANIMAL_UBICACION;
    public static final HashMap<Integer, Integer> MINIMO_ANIMAL_UBICACION;
    public static final HashMap<Integer, Integer> VELOCIDAD_MAXIMA_ANIMAL;
    public static final HashMap<Integer, Boolean> SON_COMESTIBLES;
    public static final HashMap<Integer, String> ID_ANIMALES;

    // Variables Random para inicializar Lists de objetos
    private static Random randomUbicaciones;
    private static Random randomAnimalUbicacion;
    private static Random randomClaseSerVivo;

    // Lists para almacenar Seres Vivos y Ubicaciones
    private static ArrayList<Ubicacion> ubicaciones;
    private static ArrayList<Servivo> seresvivos;

    static {

        //Inicializador HashMap PESO_ANIMALES
        PESO_ANIMALES = new HashMap<>();
        PESO_ANIMALES.put(1, 50.0);
        PESO_ANIMALES.put(2, 15.0);
        PESO_ANIMALES.put(3, 8.0);
        PESO_ANIMALES.put(4, 500.0);
        PESO_ANIMALES.put(5, 6.0);
        PESO_ANIMALES.put(6, 400.0);
        PESO_ANIMALES.put(7, 300.0);
        PESO_ANIMALES.put(8, 2.0);
        PESO_ANIMALES.put(9, 0.05);
        PESO_ANIMALES.put(10, 60.0);
        PESO_ANIMALES.put(11, 70.0);
        PESO_ANIMALES.put(12, 400.0);
        PESO_ANIMALES.put(13, 700.0);
        PESO_ANIMALES.put(14, 1.0);
        PESO_ANIMALES.put(15, 0.01);
        PESO_ANIMALES.put(16, 1.0);

        // Inicializador HashMap ALIMENTACION_ANIMALES;
        ALIMENTO_ANIMALES = new HashMap<>();
        ALIMENTO_ANIMALES.put(1, 8.0);
        ALIMENTO_ANIMALES.put(2, 3.0);
        ALIMENTO_ANIMALES.put(3, 2.0);
        ALIMENTO_ANIMALES.put(4, 80.0);
        ALIMENTO_ANIMALES.put(5, 1.0);
        ALIMENTO_ANIMALES.put(6, 60.0);
        ALIMENTO_ANIMALES.put(7, 50.0);
        ALIMENTO_ANIMALES.put(8, 0.45);
        ALIMENTO_ANIMALES.put(9, 0.01);
        ALIMENTO_ANIMALES.put(10, 10.0);
        ALIMENTO_ANIMALES.put(11, 15.0);
        ALIMENTO_ANIMALES.put(12, 50.0);
        ALIMENTO_ANIMALES.put(13, 100.0);
        ALIMENTO_ANIMALES.put(14, 0.15);
        ALIMENTO_ANIMALES.put(15, 0.0);
        ALIMENTO_ANIMALES.put(16, 0.0);

        // Inicializador HashMap MAXIMO_ANIMAL_UBICACION & MINIMO_ANIMAL_UBICACION
        MAXIMO_ANIMAL_UBICACION = new HashMap<>();
        MAXIMO_ANIMAL_UBICACION.put(1, 30);
        MAXIMO_ANIMAL_UBICACION.put(2, 30);
        MAXIMO_ANIMAL_UBICACION.put(3, 30);
        MAXIMO_ANIMAL_UBICACION.put(4, 5);
        MAXIMO_ANIMAL_UBICACION.put(5, 20);
        MAXIMO_ANIMAL_UBICACION.put(6, 20);
        MAXIMO_ANIMAL_UBICACION.put(7, 20);
        MAXIMO_ANIMAL_UBICACION.put(8, 150);
        MAXIMO_ANIMAL_UBICACION.put(9, 500);
        MAXIMO_ANIMAL_UBICACION.put(10, 140);
        MAXIMO_ANIMAL_UBICACION.put(11, 140);
        MAXIMO_ANIMAL_UBICACION.put(12, 50);
        MAXIMO_ANIMAL_UBICACION.put(13, 10);
        MAXIMO_ANIMAL_UBICACION.put(14, 200);
        MAXIMO_ANIMAL_UBICACION.put(15, 1000);
        MAXIMO_ANIMAL_UBICACION.put(16, 200);

        MINIMO_ANIMAL_UBICACION = new HashMap<>();
        MINIMO_ANIMAL_UBICACION.put(1, 6);
        MINIMO_ANIMAL_UBICACION.put(2, 6);
        MINIMO_ANIMAL_UBICACION.put(3, 6);
        MINIMO_ANIMAL_UBICACION.put(4, 2);
        MINIMO_ANIMAL_UBICACION.put(5, 5);
        MINIMO_ANIMAL_UBICACION.put(6, 5);
        MINIMO_ANIMAL_UBICACION.put(7, 5);
        MINIMO_ANIMAL_UBICACION.put(8, 30);
        MINIMO_ANIMAL_UBICACION.put(9, 100);
        MINIMO_ANIMAL_UBICACION.put(10, 27);
        MINIMO_ANIMAL_UBICACION.put(11, 27);
        MINIMO_ANIMAL_UBICACION.put(12, 10);
        MINIMO_ANIMAL_UBICACION.put(13, 2);
        MINIMO_ANIMAL_UBICACION.put(14, 40);
        MINIMO_ANIMAL_UBICACION.put(15, 200);
        MINIMO_ANIMAL_UBICACION.put(16, 40);

        // Inicializador HashMap VELOCIDAD_MAXIMA_ANIMAL
        VELOCIDAD_MAXIMA_ANIMAL = new HashMap<>();
        VELOCIDAD_MAXIMA_ANIMAL.put(1, 3);
        VELOCIDAD_MAXIMA_ANIMAL.put(2, 1);
        VELOCIDAD_MAXIMA_ANIMAL.put(3, 2);
        VELOCIDAD_MAXIMA_ANIMAL.put(4, 2);
        VELOCIDAD_MAXIMA_ANIMAL.put(5, 3);
        VELOCIDAD_MAXIMA_ANIMAL.put(6, 4);
        VELOCIDAD_MAXIMA_ANIMAL.put(7, 4);
        VELOCIDAD_MAXIMA_ANIMAL.put(8, 2);
        VELOCIDAD_MAXIMA_ANIMAL.put(9, 1);
        VELOCIDAD_MAXIMA_ANIMAL.put(10, 3);
        VELOCIDAD_MAXIMA_ANIMAL.put(11, 3);
        VELOCIDAD_MAXIMA_ANIMAL.put(12, 2);
        VELOCIDAD_MAXIMA_ANIMAL.put(13, 3);
        VELOCIDAD_MAXIMA_ANIMAL.put(14, 4);
        VELOCIDAD_MAXIMA_ANIMAL.put(15, 0);
        VELOCIDAD_MAXIMA_ANIMAL.put(16, 0);

        // Inicializador HashMap SON_COMESTIBLES
        SON_COMESTIBLES = new HashMap<>();
        SON_COMESTIBLES.put(1, false);
        SON_COMESTIBLES.put(2, true);
        SON_COMESTIBLES.put(3, true);
        SON_COMESTIBLES.put(4, false);
        SON_COMESTIBLES.put(5, false);
        SON_COMESTIBLES.put(6, true);
        SON_COMESTIBLES.put(7, true);
        SON_COMESTIBLES.put(8, true);
        SON_COMESTIBLES.put(9, true);
        SON_COMESTIBLES.put(10, true);
        SON_COMESTIBLES.put(11, true);
        SON_COMESTIBLES.put(12, true);
        SON_COMESTIBLES.put(13, true);
        SON_COMESTIBLES.put(14, true);
        SON_COMESTIBLES.put(15, true);
        SON_COMESTIBLES.put(16, true);

        // Inicializador HashMap ID_ANIMALES
        ID_ANIMALES = new HashMap<>();
        ID_ANIMALES.put(1, "Lobo");
        ID_ANIMALES.put(2, "Boa");
        ID_ANIMALES.put(3, "Zorro");
        ID_ANIMALES.put(4, "Oso");
        ID_ANIMALES.put(5, "Aguila");
        ID_ANIMALES.put(6, "Caballo");
        ID_ANIMALES.put(7, "Ciervo");
        ID_ANIMALES.put(8, "Conejo");
        ID_ANIMALES.put(9, "Raton");
        ID_ANIMALES.put(10, "Cabra");
        ID_ANIMALES.put(11, "Oveja");
        ID_ANIMALES.put(12, "Jabali");
        ID_ANIMALES.put(13, "Bufalo");
        ID_ANIMALES.put(14, "Pato");
        ID_ANIMALES.put(15, "Oruga");
        ID_ANIMALES.put(16, "Planta");

        // incializador de Arraylisys
        ubicaciones = new ArrayList<>();
        seresvivos = new ArrayList<>();
    }

    public static void incializarIsla(){

        int totalAnimalesUbicacion = 0;
        for(Map.Entry<Integer, String> dataAnimal:ID_ANIMALES.entrySet()){
            randomAnimalUbicacion = new Random();
            int intRandomAnimalUbicacion = randomAnimalUbicacion.nextInt(MAXIMO_ANIMAL_UBICACION.get(dataAnimal.getKey())) + MINIMO_ANIMAL_UBICACION.get(dataAnimal.getKey());
            System.out.println(String.format("Se crearan %d del animal %s", intRandomAnimalUbicacion, dataAnimal.getValue()));
            for(int itCreacionAnimal = 0; itCreacionAnimal < intRandomAnimalUbicacion; itCreacionAnimal++){
                int intRandomIdAnimal = randomAnimalUbicacion.nextInt(Integer.MAX_VALUE);
                System.out.print(intRandomIdAnimal + ", ");
            }
            System.out.println();
            totalAnimalesUbicacion += intRandomAnimalUbicacion;
        }

        System.out.println(String.format("Total de animales para esta ubicacion: %d", totalAnimalesUbicacion));
    }
    private static Servivo crearServivo(int claseServivo, int idServivo){}

}