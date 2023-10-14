public class ComplejoTest {
    public static void main(String[] args) {
        Complejo numero1 = new Complejo();
        Complejo numero2 = new Complejo();
        Complejo suma = new Complejo();

        numero1.asignar(3.5, 4.5);
        numero2.asignar(2.5, 2.5);

        System.out.println("Complejo 1:");
        numero1.imprimir();

        System.out.println("Complejo 2:");
        numero2.imprimir();

        suma = suma.sumar(numero1, numero2);

        System.out.println("La suma de los complejos, son:");
        suma.imprimir();
    }
}
