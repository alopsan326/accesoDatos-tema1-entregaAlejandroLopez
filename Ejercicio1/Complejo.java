public class Complejo {
    private double ParteReal;
    private double ParteImaginaria;

    public Complejo() {
        this.ParteReal = 0.0;
        this.ParteImaginaria = 0.0;
    }

    public Complejo(double dPReal, double ParteImaginaria) {
        this.ParteReal = ParteReal;
        this.ParteImaginaria = ParteImaginaria;
    }

    public void asignar(double x, double y) {
        this.ParteReal = x;
        this.ParteImaginaria = y;
    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        Complejo resultado = new Complejo();
        resultado.ParteReal = c1.ParteReal + c2.ParteReal;
        resultado.ParteImaginaria = c1.ParteImaginaria + c2.ParteImaginaria;
        return resultado;
    }

    public void imprimir() {
        System.out.println("La parte Real, es : " + this.ParteReal);
        System.out.println("La parte Imaginaria, es : " + this.ParteImaginaria);
    }
}
