package org.pfmod2.ubicaciones;

import org.pfmod2.seres.Planta;
import org.pfmod2.seres.SerVivo;
import org.pfmod2.seres.animales.carnivoros.Lobo;

import java.util.List;

public class Ubicacion {

    private int idUbicacion;
    private List<SerVivo> seresVivos;

    public Ubicacion(int idUbicacion, List<SerVivo> seresVivos){
        this.idUbicacion = idUbicacion;
        this.seresVivos = seresVivos;
    }

    public int getIdUbicacion() {
        return this.idUbicacion;
    }

    public List retornarListadoAnimales(){
        return this.seresVivos;
    }

    public void reporteInicializacionUbicacion() throws InterruptedException {

        System.out.println();
        System.out.println("*".repeat(100));
        System.out.println();
        System.out.println(String.format("Ubicacion Id: -> "+ this.idUbicacion + ", Cantidad animales es esta ubicacion -> %d", seresVivos.size()));
        System.out.println(String.format("Poblacion de Plantas en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Planta).toList().stream().count()));
        System.out.println(String.format("Poblacion de Lobos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Lobo).toList().stream().count()));
        System.out.println(String.format("Poblacion de Aguilas en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Aguila).toList().stream().count()));
        System.out.println(String.format("Poblacion de Boas en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Boa).toList().stream().count()));
        System.out.println(String.format("Poblacion de Osos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Oso).toList().stream().count()));
        System.out.println(String.format("Poblacion de Zorros en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Zorro).toList().stream().count()));
        System.out.println(String.format("Poblacion de Jabalies en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Jabali).toList().stream().count()));
        System.out.println(String.format("Poblacion de Patos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Pato).toList().stream().count()));
        System.out.println(String.format("Poblacion de Ratones en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Raton).toList().stream().count()));
        System.out.println(String.format("Poblacion de Bufalos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Bufalo).toList().stream().count()));
        System.out.println(String.format("Poblacion de Caballos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Caballo).toList().stream().count()));
        System.out.println(String.format("Poblacion de Cabras en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Cabra).toList().stream().count()));
        System.out.println(String.format("Poblacion de Ciervos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Ciervo).toList().stream().count()));
        System.out.println(String.format("Poblacion de Conejos en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Conejo).toList().stream().count()));
        System.out.println(String.format("Poblacion de Ovejas en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Oveja).toList().stream().count()));
        System.out.println(String.format("Poblacion de Orugas en esta localidad -> %d", seresVivos.stream().filter(serVivo -> serVivo instanceof Oruga).toList().stream().count()));
        System.out.println();
        System.out.println("*".repeat(100));
        System.out.println();

        Thread.sleep(5000);
    }
}
