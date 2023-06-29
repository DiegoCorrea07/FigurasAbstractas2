
public class Esfera extends Circulo {

    @Override
    public double calcularPerimetro() {
        System.out.println("No se puede calcular el perímetro de una esfera.");
        return 0.0;
    }

    public double calcularAreaSuperficial() {
        return 4 * super.calcularArea();
    }

    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadio(), 3);
    }

    @Override
    public void ingresarRadio() {
        super.ingresarRadio();
    }
}
