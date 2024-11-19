package org.pfmod2.seres.animales.carnivoros;

import org.pfmod2.Configuracion;
import org.pfmod2.seres.SerVivo;
import org.pfmod2.seres.animales.Animal;
import org.pfmod2.ubicaciones.Isla;
import org.pfmod2.ubicaciones.Ubicacion;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Random;

public class Lobo extends Carnivoro{
    public Lobo(int idSerVivo, int idUbicacion, double pesoSerVivo, boolean estaVivo, double velocidadAnimal, double alimentacionAnimal, boolean comestible) {
        super(idSerVivo, idUbicacion, pesoSerVivo, estaVivo, velocidadAnimal, alimentacionAnimal, comestible);
    }

    @Override
    public void comer(SerVivo presa) {

    }

    @Override
    public void desplazarse() {
        int velocidadMaximaAnimal = Configuracion.VELOCIDAD_MAXIMA_ANIMAL.get("Lobo");
        boolean decisionDesplazarse = new Random().nextBoolean();
        if (decisionDesplazarse){
            int moverUbicaciones = new Random().nextInt(3) +1;

            if (moverUbicaciones > velocidadMaximaAnimal){
                moverUbicaciones = 3;
            }
            System.out.println(String.format("El Lobo Id No. %d intentara moverse %d ubicaciones", this.getIdSerVivo(), moverUbicaciones));
            HashMap<Integer, Ubicacion> ubicaciones = Isla.retornarUbicaciones();
            int idUbicacionActual = this.getIdUbicacion();
            boolean direccionDesplazamiento = new Random().nextBoolean();
            if(!direccionDesplazamiento && idUbicacionActual == 0 || direccionDesplazamiento && idUbicacionActual == ubicaciones.get(ubicaciones.size()-1).getIdUbicacion()){
                System.out.print(String.format("El Lobo Id %d no puede desplazarse se encuentra en ubicaciones limite Id %d", this.getIdSerVivo(), this.getIdUbicacion()));
            }
            if(!direccionDesplazamiento){
                if ((idUbicacionActual - moverUbicaciones) < ubicaciones.get(0).getIdUbicacion()){
                    System.out.println(String.format("El Lob Id %d no podra desplazarse a la ubicacion seleccionada", this.getIdSerVivo()));
                }else{
                    System.out.println(String.format("El lobo se desplazara %d ubicaciones hacia atras", moverUbicaciones));
                    this.setIdUbicacion(idUbicacionActual - moverUbicaciones);
                }
            }

            if (direccionDesplazamiento){
                if((idUbicacionActual + moverUbicaciones) > ubicaciones.get(ubicaciones.size()-1).getIdUbicacion()){
                    System.out.println(String.format("El Lob Id %d no podra desplazarse a la ubicacion seleccionada", this.getIdSerVivo()));
                }else {
                    System.out.println(String.format("El lobo se desplazara %d ubicaciones hacia adelante", moverUbicaciones));
                    this.setIdUbicacion(idUbicacionActual + moverUbicaciones);
                }
            }
        }
    }
}
