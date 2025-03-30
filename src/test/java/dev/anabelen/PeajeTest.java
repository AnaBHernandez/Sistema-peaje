package dev.anabelen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeajeTest {

    @Test
    public void testCalcularPeajeCoche() {
        Peaje peaje = new Peaje("Peaje Norte", "Madrid");
        Vehiculo coche = new Vehiculo("ABC-1234", "coche");
        assertEquals(100.0, peaje.calcularPeaje(coche));
    }

    @Test
    public void testCalcularPeajeMoto() {
        Peaje peaje = new Peaje("Peaje Sur", "Barcelona");
        Vehiculo moto = new Vehiculo("XYZ-5678", "moto");
        assertEquals(50.0, peaje.calcularPeaje(moto));
    }

    @Test
    public void testCalcularPeajeCamion() {
        Peaje peaje = new Peaje("Peaje Este", "Valencia");
        Vehiculo camion = new Vehiculo("LMN-9101", "camion" , 4);
        assertEquals(200.0, peaje.calcularPeaje(camion));
    }
    @Test
    public void testTotalRecaudado() {
        Peaje peaje = new Peaje("Peaje Norte", "Madrid");
        Vehiculo coche = new Vehiculo("ABC-1234", "coche");
        Vehiculo moto = new Vehiculo("XYZ-5678", "moto");
        Vehiculo camion = new Vehiculo("LMN-9101", "camion", 4);
        peaje.calcularPeaje(coche);
        assertEquals(100.0, peaje.getTotalRecaudado());
    }

    @Test
    public void testListaVehiculos() {
        Peaje peaje = new Peaje("Peaje Norte", "Madrid");
        Vehiculo coche = new Vehiculo("ABC-1234", "coche");
        Vehiculo moto = new Vehiculo("XYZ-5678", "moto");
        Vehiculo camion = new Vehiculo("LMN-9101", "camion", 4);
        peaje.calcularPeaje(coche);
        peaje.calcularPeaje(moto);
        peaje.calcularPeaje(camion);
        assertTrue(peaje.getVehiculos().contains(coche));
        assertTrue(peaje.getVehiculos().contains(moto));
        assertTrue(peaje.getVehiculos().contains(camion));

}
}
