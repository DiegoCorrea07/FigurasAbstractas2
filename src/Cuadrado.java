import java.util.Scanner;

public class Cuadrado extends Figura{

    double l;

    public Cuadrado(double l) {
        this.l = l;
    }

    public Cuadrado() {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = l *4;

        return perimetro;
    }

    @Override
    public double calcularArea() {
        return Math.pow(l,2);
    }

    public void ingresarLado(){
        Scanner sc = new Scanner(System.in);
        super.ingresarPuntos();
        System.out.println("Ingrese el lado del cuadrado: ");
        l = sc.nextDouble();
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
