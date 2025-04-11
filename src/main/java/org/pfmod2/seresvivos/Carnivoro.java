package org.pfmod2.seresvivos;

import org.pfmod2.Isla;
import org.pfmod2.utilidades.Inicializador;

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
        int intDesplazamiento = randomDireccion.nextInt(0, 5);
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
    public void reproducirSerVivo(SerVivo pareja) {
        Random randomProbabilidadReproduccion = new Random();
        int intRandomProbabilidadReproduccion = randomProbabilidadReproduccion.nextInt(0, 101);
        System.out.println("*".repeat(50));
        if(this.obtenerEspecie().equals(pareja.obtenerEspecie()) && this.obtenerIdLocalidad() == pareja.obtenerIdLocalidad() && intRandomProbabilidadReproduccion > 85){
            Isla.agregarServivo(Inicializador.crearSerVivo(this.obtenerIdLocalidad(), this.obtenerEspecie()));
            System.out.println(String.format("Los seres vivos Id %d e id %d, se han reproducido satisfactoriamente",this.obtenerId(), pareja.obtenerId()));
        }else{
            System.out.println("Ha fallado el intento de reproduccion");
        }
        System.out.println("*".repeat(50));

        /* Pendiente:
        * Revisar y finalizar metodo de interface reproducirSerVivo, se debe obtener un ArrayList con los seres vivos de la localidad que concuerden con la del objeto que invoca
        * iniciar con los metodos de interface alimentarSerVivo y finalizarSerVivo*/
    }
}
