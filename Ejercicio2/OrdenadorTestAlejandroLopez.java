package Ejercicio2;

public class OrdenadorTestAlejandroLopez {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador("LS234", 16, "Intel i5", 300.0);
        Portatil portatil1 = new Portatil("USF5689", 8, "Ryzen 5", 900.0, 3.5);
        Sobremesa sobremesa1 = new Sobremesa("AlSA678", 32, "iNTEL I7", 1200.0, "MicroATX");

        System.out.println("Ordenador 1:");
        System.out.println(ordenador1);
        System.out.println("----------");
        System.out.println("Portatil 1:");
        System.out.println(portatil1);
        System.out.println("----------");
        System.out.println("Sobremesa 1:");
        System.out.println(sobremesa1);
    }
}