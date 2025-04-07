package org.pfmod2;


import org.pfmod2.seresvivos.SerVivo;
import org.pfmod2.utilidades.Especies;
import org.pfmod2.utilidades.Inicializador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(Especies especie: Especies.values()){
            System.out.println(especie.obtenerNumeroMaximo());
        }

        Inicializador.crearLocalidades();
        System.out.println("*".repeat(20));
        Inicializador.establecerCantidadPorEspecie();
        SerVivo testServivo = Inicializador.crearSerVivo(8,"Caballo");
        System.out.println(testServivo.getClass());
    }
}

