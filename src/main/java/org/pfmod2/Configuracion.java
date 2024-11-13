package org.pfmod2;

import org.pfmod2.seres.Planta;
import org.pfmod2.seres.SerVivo;
import org.pfmod2.seres.animales.Animal;
import org.pfmod2.seres.animales.carnivoros.Aguila;
import org.pfmod2.seres.animales.carnivoros.Boa;
import org.pfmod2.seres.animales.carnivoros.Lobo;
import org.pfmod2.seres.animales.carnivoros.Oso;
import org.pfmod2.seres.animales.herbivoros.*;
import org.pfmod2.seres.animales.omnivoros.Jabali;
import org.pfmod2.seres.animales.omnivoros.Pato;
import org.pfmod2.seres.animales.omnivoros.Raton;
import org.pfmod2.seres.animales.omnivoros.Zorro;
import org.pfmod2.ubicaciones.Isla;
import org.pfmod2.ubicaciones.Ubicacion;

import java.util.*;
import java.util.stream.Stream;

public class Configuracion {

    // Constantes
    private static final int LIMITE_UBICACIONES = 16;
    private static final int MAXIMO_SERES_UBICACION = 2545;
    private static final HashMap<String, Double> PESO_ANIMALES;
    private static final HashMap<String, Double> ALIMENTO_ANIMALES;
    private static final HashMap<String, Integer> MAXIMO_ANIMAL_UBICACION;
    private static final HashMap<String,Integer> VELOCIDAD_MAXIMA_ANIMAL;
    private static final HashMap<String, Boolean> SON_COMESTIBLES;
    private static final HashMap<Integer, String> ID_ANIMALES;

    // Variables Random para inicializar Lists de objetos
    private static Random randomUbicaciones;
    private static Random randomSeres;
    private static Random randomSerVivo;

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
        PESO_ANIMALES.put("Aguila", 6.0);
        PESO_ANIMALES.put("Caballo", 400.0);
        PESO_ANIMALES.put("Ciervo", 300.0);
        PESO_ANIMALES.put("Conejo", 2.0);
        PESO_ANIMALES.put("Raton",0.05);
        PESO_ANIMALES.put("Cabra", 60.0);
        PESO_ANIMALES.put("Oveja", 70.0);
        PESO_ANIMALES.put("Jabali", 400.0);
        PESO_ANIMALES.put("Bufalo", 700.0);
        PESO_ANIMALES.put("Pato", 1.0);
        PESO_ANIMALES.put("Oruga",0.01);
        PESO_ANIMALES.put("Planta", 1.0);

        // Inicializador HashMap ALIMENTACION_ANIMALES;
        ALIMENTO_ANIMALES = new HashMap<>();
        ALIMENTO_ANIMALES.put("Lobo", 8.0);
        ALIMENTO_ANIMALES.put("Boa", 3.0);
        ALIMENTO_ANIMALES.put("Zorro", 2.0);
        ALIMENTO_ANIMALES.put("Oso", 80.0);
        ALIMENTO_ANIMALES.put("Aguila", 1.0);
        ALIMENTO_ANIMALES.put("Caballo", 60.0);
        ALIMENTO_ANIMALES.put("Ciervo", 50.0);
        ALIMENTO_ANIMALES.put("Conejo",0.45);
        ALIMENTO_ANIMALES.put("Raton",0.01);
        ALIMENTO_ANIMALES.put("Cabra", 10.0);
        ALIMENTO_ANIMALES.put("Oveja", 15.0);
        ALIMENTO_ANIMALES.put("Jabali", 50.0);
        ALIMENTO_ANIMALES.put("Bufalo", 100.0);
        ALIMENTO_ANIMALES.put("Pato",0.15);
        ALIMENTO_ANIMALES.put("Oruga", 0.0);
        ALIMENTO_ANIMALES.put("Planta",0.0);

        // Inicializador HashMap MAXIMO_ANIMAL_UBICACION
        MAXIMO_ANIMAL_UBICACION = new HashMap<>();
        MAXIMO_ANIMAL_UBICACION.put("Lobo",30);
        MAXIMO_ANIMAL_UBICACION.put("Boa",30);
        MAXIMO_ANIMAL_UBICACION.put("Zorro",30);
        MAXIMO_ANIMAL_UBICACION.put("Oso",5);
        MAXIMO_ANIMAL_UBICACION.put("Aguila",20);
        MAXIMO_ANIMAL_UBICACION.put("Caballo",20);
        MAXIMO_ANIMAL_UBICACION.put("Ciervo",20);
        MAXIMO_ANIMAL_UBICACION.put("Conejo",150);
        MAXIMO_ANIMAL_UBICACION.put("Raton",500);
        MAXIMO_ANIMAL_UBICACION.put("Cabra",140);
        MAXIMO_ANIMAL_UBICACION.put("Oveja",140);
        MAXIMO_ANIMAL_UBICACION.put("Jabali",50);
        MAXIMO_ANIMAL_UBICACION.put("Bufalo",10);
        MAXIMO_ANIMAL_UBICACION.put("Pato",200);
        MAXIMO_ANIMAL_UBICACION.put("Oruga",1000);
        MAXIMO_ANIMAL_UBICACION.put("Planta",200);

        // Inicializador HashMap VALOCIDAD_MAXIMA_ANIMAL
        VELOCIDAD_MAXIMA_ANIMAL = new HashMap<>();
        VELOCIDAD_MAXIMA_ANIMAL.put("Lobo",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Boa",1);
        VELOCIDAD_MAXIMA_ANIMAL.put("Zorro",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Oso",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Aguila",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Caballo",4);
        VELOCIDAD_MAXIMA_ANIMAL.put("Ciervo",4);
        VELOCIDAD_MAXIMA_ANIMAL.put("Conejo",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Raton",1);
        VELOCIDAD_MAXIMA_ANIMAL.put("Cabra",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Oveja",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Jabali",2);
        VELOCIDAD_MAXIMA_ANIMAL.put("Bufalo",3);
        VELOCIDAD_MAXIMA_ANIMAL.put("Pato",4);
        VELOCIDAD_MAXIMA_ANIMAL.put("Oruga",0);
        VELOCIDAD_MAXIMA_ANIMAL.put("Planta",0);

        // Inicializador HashMap SON_COMESTIBLES
        SON_COMESTIBLES = new HashMap<>();
        SON_COMESTIBLES.put("Lobo",false);
        SON_COMESTIBLES.put("Boa",true);
        SON_COMESTIBLES.put("Zorro",true);
        SON_COMESTIBLES.put("Oso",false);
        SON_COMESTIBLES.put("Aguila",false);
        SON_COMESTIBLES.put("Caballo",true);
        SON_COMESTIBLES.put("Ciervo",true);
        SON_COMESTIBLES.put("Conejo",true);
        SON_COMESTIBLES.put("Raton",true);
        SON_COMESTIBLES.put("Cabra",true);
        SON_COMESTIBLES.put("Oveja",true);
        SON_COMESTIBLES.put("Jabali",true);
        SON_COMESTIBLES.put("Bufalo",true);
        SON_COMESTIBLES.put("Pato",true);
        SON_COMESTIBLES.put("Oruga",true);
        SON_COMESTIBLES.put("Planta",true);

        // Inicializador HashMap ID_ANIMALES
        ID_ANIMALES = new HashMap<>();
        ID_ANIMALES.put(1,"Lobo");
        ID_ANIMALES.put(2,"Boa");
        ID_ANIMALES.put(3,"Zorro");
        ID_ANIMALES.put(4,"Oso");
        ID_ANIMALES.put(5,"Aguila");
        ID_ANIMALES.put(6,"Caballo");
        ID_ANIMALES.put(7,"Ciervo");
        ID_ANIMALES.put(8,"Conejo");
        ID_ANIMALES.put(9,"Raton");
        ID_ANIMALES.put(10,"Cabra");
        ID_ANIMALES.put(11,"Oveja");
        ID_ANIMALES.put(12,"Jabali");
        ID_ANIMALES.put(13,"Bufalo");
        ID_ANIMALES.put(14,"Pato");
        ID_ANIMALES.put(15,"Oruga");
        ID_ANIMALES.put(16,"Planta");


    }

    public static Isla inicializarIsla(){

        /**
         * Cuerpo de inicializacion de isla, donde se incluye inicializacion de un numero ranrom de Ubicaciones
         * */
        randomUbicaciones = new Random();
        int numeroUbicaciones = (int) randomUbicaciones.nextInt(LIMITE_UBICACIONES) + 1;
        ubicaciones = new ArrayList<Ubicacion>();
        for(int itUbicaciones = 0; itUbicaciones < numeroUbicaciones; itUbicaciones++){
            randomSeres = new Random();
            int numeroSeres = (int) randomSeres.nextInt(MAXIMO_SERES_UBICACION) + 1;
            seresVivos = new ArrayList<SerVivo>();


            for (int itSeresVivos = 0; itSeresVivos < numeroSeres; itSeresVivos++){
                seresVivos.add(retornarSerVivo(itSeresVivos));
            }

            ubicaciones.add(new Ubicacion(itUbicaciones, seresVivos));
        }

        return new Isla(ubicaciones);
    }

    public static SerVivo retornarSerVivo(int idSerVivo){

        /**
         * Cuerpo cracion de animales en modo random, se extiende debido a que no se pueden crear objetos desde valores de variables
         * El iterador de seres vivos "itSeresVivos" define la cantidad de seres que habra en la ubicacion teniendo en cuenta
         * la maxima poblacion de 2545 individuos
         * Este es un prototipo mientras se encuentra un metodo mas efectivo para crear las los objetos requeridos
         * Pendiente codigo para mejorar crecion de objetos partiendo por los recursos (Plantas, Orugas)
         * */
        randomSerVivo = new Random();
        int intRandomSerVivo = randomSerVivo.nextInt(16)+1;
        SerVivo serVivo = switch(intRandomSerVivo){
            case 1 -> {
                yield (new Lobo(idSerVivo,
                        PESO_ANIMALES.get("Lobo"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Lobo"),
                        ALIMENTO_ANIMALES.get("Lobo"),
                        SON_COMESTIBLES.get("Lobo")));
            }
            case 2 -> {
                yield (new Boa(idSerVivo,
                        PESO_ANIMALES.get("Boa"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Boa"),
                        ALIMENTO_ANIMALES.get("Boa"),
                        SON_COMESTIBLES.get("Boa")));
            }

            case 3 -> {
                yield (new Zorro(idSerVivo,
                        PESO_ANIMALES.get("Zorro"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Zorro"),
                        ALIMENTO_ANIMALES.get("Zorro"),
                        SON_COMESTIBLES.get("Zorro")));
            }
            case 4 -> {
                yield (new Oso(idSerVivo,
                        PESO_ANIMALES.get("Oso"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Oso"),
                        ALIMENTO_ANIMALES.get("Oso"),
                        SON_COMESTIBLES.get("Oso")));
            }
            case 5 -> {
                yield (new Aguila(idSerVivo,
                        PESO_ANIMALES.get("Aguila"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Aguila"),
                        ALIMENTO_ANIMALES.get("Aguila"),
                        SON_COMESTIBLES.get("Aguila")));
            }
            case 6 -> {
                yield (new Caballo(idSerVivo,
                        PESO_ANIMALES.get("Caballo"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Caballo"),
                        ALIMENTO_ANIMALES.get("Caballo"),
                        SON_COMESTIBLES.get("Caballo")));
            }

            case 7 -> {
                yield (new Ciervo(idSerVivo,
                        PESO_ANIMALES.get("Ciervo"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Ciervo"),
                        ALIMENTO_ANIMALES.get("Ciervo"),
                        SON_COMESTIBLES.get("Ciervo")));
            }

            case 8 -> {
                yield (new Conejo(idSerVivo,
                        PESO_ANIMALES.get("Conejo"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Conejo"),
                        ALIMENTO_ANIMALES.get("Conejo"),
                        SON_COMESTIBLES.get("Conejo")));
            }

            case 9 -> {
                yield (new Raton(idSerVivo,
                        PESO_ANIMALES.get("Raton"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Raton"),
                        ALIMENTO_ANIMALES.get("Raton"),
                        SON_COMESTIBLES.get("Raton")));
            }

            case 10 -> {
                yield (new Cabra(idSerVivo,
                        PESO_ANIMALES.get("Cabra"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Cabra"),
                        ALIMENTO_ANIMALES.get("Cabra"),
                        SON_COMESTIBLES.get("Cabra")));
            }

            case 11 -> {
                yield (new Oveja(idSerVivo,
                        PESO_ANIMALES.get("Oveja"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Oveja"),
                        ALIMENTO_ANIMALES.get("Oveja"),
                        SON_COMESTIBLES.get("Oveja")));
            }

            case 12 -> {
                yield (new Jabali(idSerVivo,
                        PESO_ANIMALES.get("Jabali"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Jabali"),
                        ALIMENTO_ANIMALES.get("Jabali"),
                        SON_COMESTIBLES.get("Jabali")));
            }

            case 13 -> {
                yield (new Bufalo(idSerVivo,
                        PESO_ANIMALES.get("Bufalo"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Bufalo"),
                        ALIMENTO_ANIMALES.get("Bufalo"),
                        SON_COMESTIBLES.get("Bufalo")));
            }

            case 14 -> {
                yield (new Pato(idSerVivo,
                        PESO_ANIMALES.get("Pato"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Pato"),
                        ALIMENTO_ANIMALES.get("Pato"),
                        SON_COMESTIBLES.get("Pato")));
            }

            case 15 -> {
                yield (new Oruga(idSerVivo,
                        PESO_ANIMALES.get("Oruga"),
                        true,VELOCIDAD_MAXIMA_ANIMAL.get("Oruga"),
                        ALIMENTO_ANIMALES.get("Oruga"),
                        SON_COMESTIBLES.get("Oruga")));
            }

            default -> {
                yield (new Planta(idSerVivo,
                        PESO_ANIMALES.get("Planta"),
                        true));
            }
            /**
             * Fin de cuerpo de creación random de SeresVivos
             * */
        };
        return serVivo;
    }

}
