package org.pfmod2;

import org.pfmod2.seres.animales.carnivoros.Lobo;
import org.pfmod2.ubicaciones.Isla;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Isla islaLocal = Configuracion.inicializarIsla();
        /**
         * Bloque de prueba de inicializacion
         * Resultado: exitoso
         * Pendientes mejoras
         * */
        islaLocal.imprimirUbicaciones();

        /**
         * Bloque de prueba de prototipo desplazamiento
         * Resultado: exitoso
         * Pentiende mejoras
         * Deshabilitar temporalmente*/
        //islaLocal.probarLobo();

        /**
         * Bloque de prueba de prototipo coer*/
        islaLocal.imprimirSeresVivos();
        //islaLocal.probarComerLobo();


    }
}

