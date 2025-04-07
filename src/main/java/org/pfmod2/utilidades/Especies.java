package org.pfmod2.utilidades;

public enum Especies {
    LOBO("Lobo",50,30,3,8,"Carnivoro"),
    BOA("Boa",15,30,1,3,"Carnivoro"),
    ZORRO("Zorro",8,30,2,2,"Carnivoro"),
    OSO("Oso",500,5,2,80,"Carnivoro"),
    AGUILA("Aguila",6,20,3,1,"Carnivoro"),
    CABALLO("Caballo",400,20,4,60,"Herbivoro"),
    CIERVO("Ciervo",300,20,4,50,"Herbivoro"),
    CONEJO("Conejo",2,150,2,0.45,"Herbivoro"),
    RATON("Raton",0.05,500,1,0.01,"Omnivoro"),
    CABRA("Cabra",60,140,3,10,"Herbivoro"),
    OVEJA("Oveja",70,140,3,15,"Herbivoro"),
    JABALI("Jabali",400,50,2,50,"Omnivoro"),
    BUFALO("Bufalo",700,10,3,100,"Herbivoro"),
    PATO("Pato",1,200,4,0.15,"Omnivoro"),
    ORUGA("Oruga",0.01,1000,0,0,"Herbivoro"),
    PLANTA("Planta",1,200,0,0,"Planta");


    private String especie;
    private double peso;
    private int numeroMaximo;
    private int velocidad;
    private double alimentacion;
    private String tipo;

    Especies(String especie, double peso, int numeroMaximo, int velocidad, double alimentacion, String tipo) {
        this.especie = especie;
        this.peso = peso;
        this.numeroMaximo = numeroMaximo;
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
        this.tipo = tipo;
    }

    public String obtenerEspecie() {
        return especie;
    }
    public double obtenerPeso() {
        return peso;
    }

    public int obtenerNumeroMaximo() {
        return numeroMaximo;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }

    public double obtenerAlimentacion() {
        return alimentacion;
    }

    public String obtenerTipo() {
        return tipo;
    }
}
