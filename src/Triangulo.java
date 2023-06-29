import java.util.Scanner;

public class Triangulo extends Figura {

    double l1;
    double l2;
    double l3;

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Triangulo() {
    }

    @Override
    public double calcularPerimetro() {
        l1 = calcularDistancia(0,1);
        l2 = calcularDistancia(0,2);
        l3 = calcularDistancia(1,2);
        return l1 + l2 + l3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro()/2;
        double area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        return area;
    }

    @Override
    public void ingresarPuntos() {
        boolean puntosValidos = false;
        Scanner sc = new Scanner(System.in);

        while (!puntosValidos) {
            System.out.println("Ingrese las coordenadas del primer punto:");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double z1 = sc.nextDouble();
            listaPuntos.add(new Punto(x1, y1, z1));

            System.out.println("Ingrese las coordenadas del segundo punto:");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double z2 = sc.nextDouble();
            listaPuntos.add(new Punto(x2, y2, z2));

            System.out.println("Ingrese las coordenadas del tercer punto:");
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double z3 = sc.nextDouble();
            listaPuntos.add(new Punto(x3, y3, z3));

            // Verificar si los puntos son colineales
            if (sonColineales()) {
                System.out.println("Los puntos ingresados son colineales. Vuelva a ingresar los puntos.");
                listaPuntos.clear(); // Limpiar la lista de puntos
            } else {
                puntosValidos = true;
            }
        }
    }

    protected boolean sonColineales() {
        Punto punto = listaPuntos.get(0);
        Punto punto1 = listaPuntos.get(1);
        Punto punto2 = listaPuntos.get(2);

        // Verificar si el área del triángulo formado por los puntos es cero
       double area = calcularArea();

        return area == 0;
    }

}

