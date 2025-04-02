package org.pfmod2.utilidades;

public enum Especies {
    LOBO("Lobo",50,30,3,8),
    BOA("Boa",15,30,1,3),
    ZORRO("Zorro",8,30,2,2),
    OSO("Oso",500,5,2,80),
    AGUILA("Aguila",6,20,3,1),
    CABALLO("Caballo",400,20,4,60),
    CIERVO("Ciervo",300,20,4,50),
    CONEJO("Conejo",2,150,2,0.45),
    RATON("Raton",0.05,500,1,0.01),
    CABRA("Cabra",60,140,3,10),
    OVEJA("Oveja",70,140,3,15),
    JABALI("Jabali",400,50,2,50),
    BUFALO("Bufalo",700,10,3,100),
    PATO("Pato",1,200,4,0.15),
    ORUGA("Oruga",0.01,1000,0,0),
    PLANTA("Planta",1,200,0,0);

    private String nombreFormal;
    private double peso;
    private int numeroMaximo;
    private double velocidad;
    private double alimentacion;

    Especies(String nombreFormal, double peso, int numeroMaximo, double velocidad, double alimentacion) {
        this.nombreFormal = nombreFormal;
        this.peso = peso;
        this.numeroMaximo = numeroMaximo;
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
    }

    public String obtenerNombreFormal() {
        return nombreFormal;
    }
    public double obtenerPeso() {
        return peso;
    }

    public int obtenerNumeroMaximo() {
        return numeroMaximo;
    }

    public double obtenerVelocidad() {
        return velocidad;
    }

    public double obtenerAlimentacion() {
        return alimentacion;
    }
}
