package org.pfmod2;


import org.pfmod2.seresvivos.SerVivo;
import org.pfmod2.utilidades.Especies;
import org.pfmod2.utilidades.Inicializador;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Isla isla = new Isla();
        System.out.println(String.format("La isla nombre: %s, tiene %d animales",isla.obtenerNombreIsla(), isla.listarSeeresVivos().size()));
        Isla islab = new Isla();
        System.out.println(String.format("La isla nombre: %s, tiene %d animales",islab.obtenerNombreIsla(), islab.listarSeeresVivos().size()));
    }
}

