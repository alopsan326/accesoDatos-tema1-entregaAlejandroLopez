package Parking;

public class Vehiculo {
    private String matricula;
    private long inicioEstacionamiento;
    private long finEstacionamiento;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.inicioEstacionamiento = System.currentTimeMillis();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setFinEstacionamiento() {
        this.finEstacionamiento = System.currentTimeMillis();
    }

    public long getTiempoEstacionado() {
        return (finEstacionamiento - inicioEstacionamiento) / (60 * 1000); // Tiempo en minutos
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + "]";
    }
    public long calcularTiempoEstacionado() {
        return (System.currentTimeMillis() - inicioEstacionamiento) / (60 * 1000); // Tiempo en minutos
    }

}
