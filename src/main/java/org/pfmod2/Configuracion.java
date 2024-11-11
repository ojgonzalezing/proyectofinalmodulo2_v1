package org.pfmod2;

import org.pfmod2.seres.SerVivo;
import org.pfmod2.seres.animales.carnivoros.Lobo;
import org.pfmod2.ubicaciones.Isla;
import org.pfmod2.ubicaciones.Ubicacion;

import java.util.*;

public class Configuracion {

    // Constantes
    private static final int LIMITE_UBICACIONES = 16;
    private static final int MAXIMO_SERES_UBICACION = 2545;
    private static final HashMap<String, Double> PESO_ANIMALES;
    private static final HashMap<String, Double> ALIMENTO_ANIMALES;
    private static final HashMap<String, Integer> MAXIMO_ANIMAL_UBICACION;
    private static final HashMap<String,Integer> VELOCIDAD_MAXIMA_ANIMAL;
    private static final HashMap<String, Boolean> SON_COMESTIBLES;

    // Variable Random para inicializar Lists de objetos
    private static Random randomUbicaciones;
    private static Random randomSeres;

    // Lists para almacenar Seres Vivos y Ubicaciones
    private static List<SerVivo> seresVivos;
    private static List<Ubicacion> ubicaciones;

    static{

        //Inicializador HashMap PESO_ANIMALES
        PESO_ANIMALES = new HashMap<>();
        PESO_ANIMALES.put("Lobo", 50.0);
        PESO_ANIMALES.put("Boa", 15.0);
        PESO_ANIMALES.put("Zorro", 8.0);
        PESO_ANIMALES.put("Oso", 500.0);
        PESO_ANIMALES.put("Águila", 6.0);
        PESO_ANIMALES.put("Caballo", 400.0);
        PESO_ANIMALES.put("Ciervo", 300.0);
        PESO_ANIMALES.put("Conejo", 2.0);
        PESO_ANIMALES.put("Ratón",0.05);
        PESO_ANIMALES.put("Cabra", 60.0);
        PESO_ANIMALES.put("Oveja", 70.0);
        PESO_ANIMALES.put("Jabali", 400.0);
        PESO_ANIMALES.put("Búfalo", 700.0);
        PESO_ANIMALES.put("Pato", 1.0);
        PESO_ANIMALES.put("Oruga",0.01);
        PESO_ANIMALES.put("Plantas", 1.0);

        // Inicializador HashMap ALIMENTACION_ANIMALES;
        ALIMENTO_ANIMALES = new HashMap<>();
        ALIMENTO_ANIMALES.put("Lobo", 8.0);
        ALIMENTO_ANIMALES.put("Boa", 3.0);
        ALIMENTO_ANIMALES.put("Zorro", 2.0);
        ALIMENTO_ANIMALES.put("Oso", 80.0);
        ALIMENTO_ANIMALES.put("Águila", 1.0);
        ALIMENTO_ANIMALES.put("Caballo", 60.0);
        ALIMENTO_ANIMALES.put("Ciervo", 50.0);
        ALIMENTO_ANIMALES.put("Conejo",0.45);
        ALIMENTO_ANIMALES.put("Ratón",0.01);
        ALIMENTO_ANIMALES.put("Cabra", 10.0);
        ALIMENTO_ANIMALES.put("Oveja", 15.0);
        ALIMENTO_ANIMALES.put("Jabali", 50.0);
        ALIMENTO_ANIMALES.put("Búfalo", 100.0);
        ALIMENTO_ANIMALES.put("Pato",0.15);
        ALIMENTO_ANIMALES.put("Oruga", 0.0);
        ALIMENTO_ANIMALES.put("Plantas",0.0);

        // Inicializador HashMap MAXIMO_ANIMAL_UBICACION
        MAXIMO_ANIMAL_UBICACION = new HashMap<>();
        MAXIMO_ANIMAL_UBICACION.put("Lobo",30);
        MAXIMO_ANIMAL_UBICACION.put("Boa",30);
        MAXIMO_ANIMAL_UBICACION.put("Zorro",30);
        MAXIMO_ANIMAL_UBICACION.put("Oso",5);
        MAXIMO_ANIMAL_UBICACION.put("Águila",20);
        MAXIMO_ANIMAL_UBICACION.put("Caballo",20);
        MAXIMO_ANIMAL_UBICACION.put("Ciervo",20);
        MAXIMO_ANIMAL_UBICACION.put("Conejo",150);
        MAXIMO_ANIMAL_UBICACION.put("Ratón",500);
        MAXIMO_ANIMAL_UBICACION.put("Cabra",140);
        MAXIMO_ANIMAL_UBICACION.put("Oveja",140);
        MAXIMO_ANIMAL_UBICACION.put("Jabali",50);
        MAXIMO_ANIMAL_UBICACION.put("Búfalo",10);
        MAXIMO_ANIMAL_UBICACION.put("Pato",200);
        MAXIMO_ANIMAL_UBICACION.put("Oruga",1000);
        MAXIMO_ANIMAL_UBICACION.put("Plantas",200);

        // Inicializador HashMap VALOCIDAD_MAXIMA_ANIMAL
        VELOCIDAD_MAXIMA_ANIMAL = new HashMap<>();
        VELOCIDAD_MAXIMA_ANIMAL.put("Lobo",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Boa",1);
        VELOCIDAD_MAXIMA_ANIMAL.put("Zorro",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Oso",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Águila",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Caballo",4);
        VELOCIDAD_MAXIMA_ANIMAL.put("Ciervo",4);
        VELOCIDAD_MAXIMA_ANIMAL.put("Conejo",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Ratón",1);
        VELOCIDAD_MAXIMA_ANIMAL.put("Cabra",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Oveja",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Jabali",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Búfalo",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Pato",4);
        VELOCIDAD_MAXIMA_ANIMAL.put("Oruga",0);
        VELOCIDAD_MAXIMA_ANIMAL.put("Plantas",0);

        // Inicializador HashMap SON_COMESTIBLES
        SON_COMESTIBLES = new HashMap<>();
        SON_COMESTIBLES.put("Lobo",false);
        SON_COMESTIBLES.put("Boa",true);
        SON_COMESTIBLES.put("Zorro",true);
        SON_COMESTIBLES.put("Oso",false);
        SON_COMESTIBLES.put("Águila",false);
        SON_COMESTIBLES.put("Caballo",true);
        SON_COMESTIBLES.put("Ciervo",true);
        SON_COMESTIBLES.put("Conejo",true);
        SON_COMESTIBLES.put("Ratón",true);
        SON_COMESTIBLES.put("Cabra",true);
        SON_COMESTIBLES.put("Oveja",true);
        SON_COMESTIBLES.put("Jabali",true);
        SON_COMESTIBLES.put("Búfalo",true);
        SON_COMESTIBLES.put("Pato",true);
        SON_COMESTIBLES.put("Oruga",true);
        SON_COMESTIBLES.put("Plantas",true);

    }

    public static Isla inicializarIsla(){
        randomUbicaciones = new Random();
        int numeroUbicaciones = (int) randomUbicaciones.nextInt(LIMITE_UBICACIONES) + 1;
        ubicaciones = new ArrayList<Ubicacion>();
        for(int itUbicaciones = 0; itUbicaciones < numeroUbicaciones; itUbicaciones++){
            randomSeres = new Random();
            int numeroSeres = (int) randomSeres.nextInt(MAXIMO_SERES_UBICACION) + 1;
            seresVivos = new ArrayList<SerVivo>();
            for (int itSeresVivos = 0; itSeresVivos < numeroSeres; itSeresVivos++){
                seresVivos.add(new Lobo(itSeresVivos,
                        PESO_ANIMALES.get("Lobo"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Lobo"),
                        ALIMENTO_ANIMALES.get("Lobo"),
                        SON_COMESTIBLES.get("Lobo")));
            }

            ubicaciones.add(new Ubicacion(itUbicaciones, seresVivos));
        }
        return new Isla(ubicaciones);
    }
}
