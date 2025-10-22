package seresvivos;

/**
 * Clase abstracta que contiene los atributos principales de los seres vivos
 */

public abstract class SerVivo {
    protected Long id;
    protected byte vida;
    protected short peso;
    protected byte ubicacion;
    protected String tipo;

    public SerVivo(Long id, byte vida, short peso, byte ubicacion, String tipo){
        this.id = id;
        this.vida = vida;
        this.peso = peso;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }

    protected SerVivo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte getVida() {
        return vida;
    }

    public void setVida(byte vida) {
        this.vida = vida;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }
    public String getTipo() {
        return tipo;
    }

    public byte getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(byte ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean estaVivo(){
        return vida > 0;
    }
}
