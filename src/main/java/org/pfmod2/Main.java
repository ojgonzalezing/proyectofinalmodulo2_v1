package org.pfmod2;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Isla isla = new Isla();
        System.out.println(String.format("La isla nombre: %s, tiene %d animales",isla.obtenerNombreIsla(), isla.listarSeresVivos().size()));
        Isla.imprimitAnimalesUbicaciones();
    }
}

