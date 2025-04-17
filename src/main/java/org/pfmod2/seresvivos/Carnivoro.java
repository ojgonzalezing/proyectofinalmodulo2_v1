package org.pfmod2.seresvivos;

import org.pfmod2.Isla;
import org.pfmod2.utilidades.Especies;
import org.pfmod2.utilidades.Inicializador;

import java.util.ArrayList;
import java.util.Random;

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
        Random randomReproduccion = new Random();
        int intRandomProbabilidad = randomReproduccion.nextInt(0, 101);
        ArrayList<SerVivo> seresVivosLocal = new ArrayList<>();
        System.out.println("*".repeat(50));
        if(intRandomProbabilidad > 85){
            seresVivosLocal.add(Inicializador.crearSerVivo(this.obtenerIdLocalidad(),this.obtenerEspecie()));
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
}
