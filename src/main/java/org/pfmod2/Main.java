package org.pfmod2;

import org.pfmod2.seres.animales.carnivoros.Lobo;
import org.pfmod2.ubicaciones.Isla;
import org.pfmod2.ubicaciones.Ubicacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.pfmod2.Configuracion.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Isla islaLocal = Configuracion.inicializarIsla();
        List<Ubicacion> ubicaciones = islaLocal.retornarUbicaciones();
        for(Ubicacion ubicacion:ubicaciones){
            ubicacion.listarUbicaciones();
        }
    }
}
