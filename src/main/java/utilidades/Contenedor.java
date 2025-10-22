package utilidades;

import seresvivos.Animal;
import seresvivos.Herbivoro;
import seresvivos.Planta;
import seresvivos.SerVivo;

import java.util.ArrayList;
import java.util.List;

public class Contenedor <T extends SerVivo>{

    List<T> listadoSeresVivos;

    public void addSerVivo(T serVivo){
        listadoSeresVivos.add(serVivo);
    }

    public T getSerVivo(int index){
        return listadoSeresVivos.get(index);
    }

    public int getSize(){
        return listadoSeresVivos.size();
    }

    public List<T> getListadoSeresVivos() {
        return listadoSeresVivos;
    }
    public void setListadoSeresVivos(List<T> listadoSeresVivos) {
        this.listadoSeresVivos = listadoSeresVivos;
    }

    public List<Planta> getListadoPlantas(){
        List<Planta> listadoPlantas = new ArrayList<>();
        for(T serVivo:listadoSeresVivos){
            if(serVivo instanceof Planta){
                listadoPlantas.add((Planta)serVivo);
            }
        }
        return listadoPlantas;
    }

    public List<Animal> getListadoAnimales(){
        List<Animal> listadoAnimales = new ArrayList<>();

        for(T serVivo:listadoSeresVivos){
            if(serVivo instanceof Animal){
                listadoAnimales.add((Animal)serVivo);
            }
        }
        return listadoAnimales;
    }

    public List<Herbivoro> getListadoHerbivores(){
        // Version lambda metodo listad de Herbivores
        return listadoSeresVivos.stream().filter(serVivo -> serVivo instanceof Herbivoro).map(serVivo -> (Herbivoro)serVivo).toList();
    }
}
