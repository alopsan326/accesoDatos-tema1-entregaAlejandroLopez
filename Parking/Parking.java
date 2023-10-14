package Parking;

public interface Parking {
    boolean hayPlaza();
    void aparcaCoche(Vehiculo coche);
    void sacaCoche(Vehiculo coche);
    double getFactura(Vehiculo coche); // Método para calcular la factura
}

