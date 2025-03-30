package dev.anabelen;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String ciudad;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public Peaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0.0;
        this.vehiculos = new ArrayList<>();
    }

    public double CalcularPeaje(Vehiculo vehiculo) {
        double valorPeaje = 0.0;
        if (vehiculo.getTipo().equalsIgnoreCase("coche")) {
            valorPeaje = 100;
        } else if (vehiculo.getTipo().equalsIgnoreCase("moto")) {
            valorPeaje = 50;
        } else if (vehiculo.getTipo().equalsIgnoreCase("camion")) {
            valorPeaje = vehiculo.getEjes() * 50;
        }

        totalRecaudado += valorPeaje;
        vehiculos.add(vehiculo);
        return valorPeaje;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }
   public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

}
