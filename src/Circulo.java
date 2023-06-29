import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void ingresarRadio() {
        Scanner sc = new Scanner(System.in);
        super.ingresarPuntos();
        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
