package org.pfmod2.seresvivos;

import org.pfmod2.Isla;
import org.pfmod2.utilidades.Especies;
import org.pfmod2.utilidades.Probabilidades;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Carnivoro extends SerVivo{
    private int velocidad;
    private double alimentacion;

    public Carnivoro(int id, double vida, double peso, int idLocalidad, String especie, int velocidad, double alimentacion) {
        super(id, vida, peso, idLocalidad, especie);
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }

    public void establecerVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double obtenerAlimentacion() {
        return alimentacion;
    }

    public void establecerAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public void desplazarSerVivo(Integer idLocalidad) {

        Random randomDireccion = new Random();
        int intRandomDireccion = randomDireccion.nextInt(0, 2);
        int intDestino = 0;
        int intOrigen = this.obtenerIdLocalidad();
        int intDesplazamiento = randomDireccion.nextInt(0, this.obtenerIdLocalidad()+1);
        switch (intRandomDireccion) {
            case 0:
                intDestino = intOrigen + intDesplazamiento;
                break;
            default:
                intDestino = intOrigen - intDesplazamiento;
                break;
        }
        if(intDestino < 0 || intDestino > 15){
            System.out.println(String.format("Ubicacion de destino no puede estar fuera de limites de la isla, no se desplaza SerVivo, se mantiene en ubicacion: %d", intOrigen));
        }else {
            System.out.println(String.format("Servivo id: %s, en %d se desplaza a -> ubicacion: %d",this.obtenerId(), intOrigen, intDestino));
            this.estableceridLocalidad(intDestino);
        }
    }

    @Override

    public synchronized void reproducirSerVivo() {
    /*
        IMPORTANTE: PENDIENTE IMPLEMENTAR EL METODO REPRODUCCION YA QUE ACCEDE A LISTADO DE SERES VIVOS EN ISLA, Y GENERA UN ERROR DE CONCURRENCIA
        ES PROBABLE QUE DEBA CAMBIAR EL ARRAYLIST NORMAL A UNO ADECUADO PARA CONCURRENCIA
        Random randomReproduccion = new Random();
        int intRandomProbabilidad = randomReproduccion.nextInt(0, 101);
        ArrayList<SerVivo> seresVivosLocal = new ArrayList<>();
        System.out.println("*".repeat(50));
        if(intRandomProbabilidad > 85){
            seresVivosLocal.add(Inicializador.crearSerVivo(this.obtenerIdLocalidad(),this.obtenerEspecie().toUpperCase()));
            System.out.println("Intento de reproduccion de SerVivo exitoso");
        }else{
            System.out.println("Ha fallado el intento de reproduccion");
        }
        System.out.println("*".repeat(50));

        for(SerVivo serVivo : seresVivosLocal){
            Isla.agregarServivo(serVivo);
        }

        Pendiente:
        * Revisar y finalizar metodo de interface reproducirSerVivo, se debe obtener un ArrayList con los seres vivos de la localidad que concuerden con la del objeto que invoca el metdo
        * De esa manera el objeto solo intentará reproducirse con su especie y no con otras, adicionalmente permitirá verificar que haya cupo para la especie en la localidad
        * Restricciones a considerar para reproducirse: misma localidad, misma especie, probabilidad por encima del 85%,cupo de especie disponible en localidad
        * No se considero para el ejercicio el genero de la especie, sin embargo seria interesante agregarlo, asi se consideraría un aspecto natural
        * iniciar con los metodos de interface alimentarSerVivo y finalizarSerVivo*/
    }

    @Override
    public void alimentarSerVivo() {
        Random randomAlimentar = new Random();
        int intRandomAlimentar = randomAlimentar.nextInt(0, 101);
        ArrayList<SerVivo> seresVivosUbicacion = new ArrayList<>();
        for(SerVivo presa:Isla.listarSeresVivos()){
            if (presa.obtenerIdLocalidad() == this.obtenerIdLocalidad() && presa.getClass() != this.getClass() && presa.obtenerVida() > 0){
                seresVivosUbicacion.add(presa);
            }
        }
        int intIdPresa = seresVivosUbicacion.get(randomAlimentar.nextInt(0, seresVivosUbicacion.size())).obtenerId();
        String strEspecie = seresVivosUbicacion.stream().filter(serVivo -> serVivo.obtenerId() == intIdPresa).findFirst().get().obtenerEspecie();
        switch(seresVivosUbicacion.stream().filter(presaLocal -> presaLocal.obtenerId() ==  intIdPresa).findFirst().get().obtenerEspecie()){
            case "Lobo":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsLobo()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Boa":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsBoa()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Zorro":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsZorro()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Oso":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsOso()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Aguila":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsAguila()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Caballo":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsCaballo()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Ciervo":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsCiervo()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Conejo":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsConejo()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Raton":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsRaton()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Cabra":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsCabra()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Oveja":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsOveja()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Jabali":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsJabali()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Bufalo":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsBufalo()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Pato":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsPato()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            case "Oruga":
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsOruga()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido",
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;

            default:
                if(intRandomAlimentar >= Probabilidades.valueOf(this.obtenerEspecie().toUpperCase()).obtenerVsPlanta()){
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s exitoso contra presa id->%d, especie->%s exitoso, vida de presa establecida en 0", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                    Isla.buscarServivoPorId(intIdPresa).establecerVida(0.0);
                }else {
                    System.out.println(String.format("Intento de alimentacion de cazador id->%d, especie->%s contra presa id->%d, especie->%s fallido", 
                            this.obtenerId(), this.obtenerEspecie(), intIdPresa, Isla.buscarServivoPorId(intIdPresa).obtenerEspecie()));
                }
                break;
        }
        /**
         * Este metodo fue un intento de usar reflexion para no tener que utilizar switches consecutivos, el metodo implementado para solucionar el problema
         * es un prototipo, puedo seguir experimentando posteriormente.
         *
         * Para solucionar el problema es necesario acceder al metodo adecuado de la enumeracion, no del parametro como tal
         * try {
            Class<?> enumProbabilidades = Class.forName("org.pfmod2.utilidades.Probabilidades");
            Method[] enumProbabilidadesMethods = enumProbabilidades.getDeclaredMethods();
            Method valueOfMethod = Arrays.stream(enumProbabilidadesMethods)
                    .filter(method -> method.getName().equals("valueOf"))
                    .findFirst()
                    .orElseThrow(() -> new NoSuchMethodException("valueOf method not found"));

            Method obtenerVrMethod = Arrays.stream(enumProbabilidadesMethods)
                    .filter(method -> method.getName().equals("obtenerVs" + strEspecie))
                    .findFirst()
                    .orElseThrow(() -> new NoSuchMethodException("obtenerVr method not found"));

            Object strEspecieBase = valueOfMethod.invoke(null, strEspecie.toUpperCase());
            Object strProbabilidad = valueOfMethod.invoke(null, this.obtenerEspecie().toUpperCase(), obtenerVrMethod.invoke(this,null));

            System.out.println(String.format("Probabilidad de alimentacion de %s es: %s", strEspecie, strProbabilidad));


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e);
        }*/
    }
}
