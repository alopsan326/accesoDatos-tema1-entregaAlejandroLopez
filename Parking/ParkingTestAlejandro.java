package Parking;

public class ParkingTestAlejandro {
    public static void main(String[] args) throws Exception{
        try{

//creamos
        ParkingVehiculo parking = new ParkingVehiculo("Avenida Miguel de Cervantes,2345");
        Vehiculo coche1 = new Vehiculo("6795BWE");
        Vehiculo coche2 = new Vehiculo("9357BWC");
        Vehiculo coche3 = new Vehiculo("4326PHT");
        Vehiculo coche4 = new Vehiculo("1010IUY");
        Vehiculo coche5 = new Vehiculo("2234LSD");

//aparca
        parking.aparcaCoche(coche1);
        parking.aparcaCoche(coche2);
        parking.aparcaCoche(coche3);
        parking.aparcaCoche(coche4);
        parking.aparcaCoche(coche5);

//espero
Thread.sleep(120*1000);

//salimos
        parking.sacaCoche(coche3);
        parking.sacaCoche(coche5);
        parking.sacaCoche(coche1);

        double dFactura=parking.getFactura(coche3);
        System.out.println(coche1+"; Factura="+dFactura);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

