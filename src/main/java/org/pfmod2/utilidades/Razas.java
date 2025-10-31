package org.pfmod2.utilidades;

public enum Razas {

    LOBO("Lobo", (short) 50,30,3,8, 45, 01, "Carnivoro"),
    BOA("Boa", (short) 15,30,1,3, 45, 01, "Carnivoro"),
    ZORRO("Zorro", (short) 8,30,2,2, 45, 01, "Carnivoro"),
    OSO("Oso", (short) 500,5,2,80, 45, 01, "Carnivoro"),
    AGUILA("Aguila", (short) 6,20,3,1, 45, 01, "Carnivoro"),
    CABALLO("Caballo", (short) 400,20,4,60, 45, 01, "Herbivoro"),
    CIERVO("Ciervo", (short) 300,20,4,50, 45, 01, "Herbivoro"),
    CONEJO("Conejo",(short) 2,150,2,0,45, 01, "Herbivoro"),
    CABRA("Cabra",(short) 60,140,3,10, 45, 01, "Herbivoro"),
    OVEJA("Oveja",(short) 70,140,3,15, 45, 01, "Herbivoro"),
    BUFALO("Bufalo",(short) 700,10,3,100, 45, 01, "Herbivoro"),
    ORUGA("Oruga",(short) 0,01,1000,0,0, 01, "Herbivoro"),
    RATON("Raton",(short) 0,05,500,1,0,01,"Omnivoro"),
    JABALI("Jabali",(short) 400,50,2,50, 45, 01, "Omnivoro"),
    PATO("Pato",(short) 1,200,4,0,15, 01, "Omnivoro"),
    PLANTA("Planta",(short) 1,200,0,0, 45, 01, "Planta");

    private final String raza;
    private final short peso;
    private final int maximoLocalidad;
    private final int velocidad;
    private final int alimentacion;
    private final String especie;


    Razas(String raza, short peso, int maximoLocalidad, int velocidad, int alimentacion, int i, int i1, String especie) {
        this.raza = raza;
        this.peso = peso;
        this.maximoLocalidad = maximoLocalidad;
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
        this.especie = especie;
    }
}
