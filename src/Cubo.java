import java.util.Scanner;

public class Cubo extends Cuadrado {

    @Override
    public double calcularPerimetro() {
        return 12 * getL();
    }
    public double calcularAreaSuperficial() {
        return 6 * calcularArea();
    }

    public double calcularVolumen() {
        return Math.pow(getL(), 3);
    }

    public void ingresarLado() {
        super.ingresarLado();
    }

}
