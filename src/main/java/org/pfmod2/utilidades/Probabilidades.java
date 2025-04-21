package org.pfmod2.utilidades;

public enum Probabilidades {
    LOBO("Lobo",0,0,0,0,0,10,15,60,80,60,70,15,10,40,0,0),
    BOA("Boa",0,0,15,0,0,0,0,20,40,0,0,0,0,10,0,0),
    ZORRO("Zorro",0,0,0,0,0,0,0,70,90,0,0,0,0,60,40,0),
    OSO("Oso",0,80,0,0,0,40,80,80,90,70,70,50,20,10,0,0),
    AGUILA("Aguila", 0,0,10,0,0,0,0,90,90,0,0,0,0,80,0,0),
    CABALLO("Caballo",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    CIERVO("Ciervo",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    CONEJO("Conejo",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    RATON("Raton",0,0,0,0,0,0,0,0,0,0,0,0,0,0,90,100),
    CABRA("Cabra",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    OVEJA("Oveja",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    JABALI("Jabali",0,0,0,0,0,0,0,0,50,0,0,0,0,0,90,100),
    BUFALO("Bufalo",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    PATO("Pato",0,0,0,0,0,0,0,0,0,0,0,0,0,0,90,100),
    ORUGA("Oruga",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100),
    PLANTA("Planta",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

    private String especie;
    private int vsLobo;
    private int vsBoa;
    private int vsZorro;
    private int vsOso;
    private int vsAguila;
    private int vsCaballo;
    private int vsCiervo;
    private int vsConejo;
    private int vsRaton;
    private int vsCabra;
    private int vsOveja;
    private int vsJabali;
    private int vsBufalo;
    private int vsPato;
    private int vsOruga;
    private int vsPlanta;

    Probabilidades(String especie, int vsLobo,	int vsBoa,	int vsZorro,	int vsOso,	int vsAguila,	int vsCaballo,	int vsCiervo,	int vsConejo,	int vsRaton,	int vsCabra,	int vsOveja,	int vsJabali,	int vsBufalo,	int vsPato,	int vsOruga,	int vsPlanta){
        this.vsLobo=vsLobo;
        this.vsBoa=vsBoa;
        this.vsZorro=vsZorro;
        this.vsOso=vsOso;
        this.vsAguila=vsAguila;
        this.vsCaballo=vsCaballo;
        this.vsCiervo=vsCiervo;
        this.vsConejo=vsConejo;
        this.vsRaton=vsRaton;
        this.vsCabra=vsCabra;
        this.vsOveja=vsOveja;
        this.vsJabali=vsJabali;
        this.vsBufalo=vsBufalo;
        this.vsPato=vsPato;
        this.vsOruga=vsOruga;
        this.vsPlanta=vsPlanta;
    }

    public String obtenerEspecie() {
        return especie;
    }
    public int obtenerVsLobo() {
        return vsLobo;
    }

    public int obtenerVsBoa() {
        return vsBoa;
    }

    public int obtenerVsZorro() {
        return vsZorro;
    }

    public int obtenerVsOso() {
        return vsOso;
    }

    public int obtenerVsAguila() {
        return vsAguila;
    }

    public int obtenerVsCaballo() {
        return vsCaballo;
    }

    public int obtenerVsCiervo() {
        return vsCiervo;
    }

    public int obtenerVsConejo() {
        return vsConejo;
    }

    public int obtenerVsRaton() {
        return vsRaton;
    }

    public int obtenerVsCabra() {
        return vsCabra;
    }

    public int obtenerVsOveja() {
        return vsOveja;
    }

    public int obtenerVsJabali() {
        return vsJabali;
    }

    public int obtenerVsBufalo() {
        return vsBufalo;
    }

    public int obtenerVsPato() {
        return vsPato;
    }

    public int obtenerVsOruga() {
        return vsOruga;
    }

    public int obtenerVsPlanta() {
        return vsPlanta;
    }
}
