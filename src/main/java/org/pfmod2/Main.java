package org.pfmod2;


import org.pfmod2.utilidades.Especies;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(Especies especie: Especies.values()){
            System.out.println(especie.ordinal());
        }
    }
}

