package dev.anabelen;

public class Vehiculo {
    private String placa;
    private String tipo;
    private int ejes;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;

    }

    public Vehiculo(String placa, String tipo, int ejes) {
        this.placa = placa;
        this.tipo = tipo;
        this.ejes = ejes;
    }

    public String getPlaca() {
        return placa;
    }
    public String getTipo() {
        return tipo;
    }
    public int getEjes() {
        return ejes;
    }

}
