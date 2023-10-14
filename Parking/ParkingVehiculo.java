package Parking;

public class ParkingVehiculo implements Parking {
    private static final double PRECIO_POR_MINUTO = 0.0425;
    private static final int MAX_PLAZAS = 100;
    private String direccion;
    private int plazasOcupadas;

    public ParkingVehiculo(String direccion) {
        this.direccion = direccion;
        this.plazasOcupadas = 0;
    }

    @Override
    public boolean hayPlaza() {
        return plazasOcupadas < MAX_PLAZAS;
    }

    @Override
    public void aparcaCoche(Vehiculo coche) {
        if (hayPlaza()) {
            // Lógica para aparcar el coche
            plazasOcupadas++;
            System.out.println("El coche, " + coche.getMatricula() + " aparco correctamente.");
        } else {
            System.out.println("El parking esta lleno," + coche.getMatricula());
        }
    }

    @Override
    public void sacaCoche(Vehiculo coche) {
        // Lógica para sacar el coche
        plazasOcupadas--;
        System.out.println("El coche, " + coche.getMatricula() + " salio.");
    }

    @Override
    public double getFactura(Vehiculo coche) {
        long minutosEstacionado = coche.calcularTiempoEstacionado();
        return minutosEstacionado * PRECIO_POR_MINUTO;
    }
   
  
}
