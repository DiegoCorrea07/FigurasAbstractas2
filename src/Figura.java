import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {

    List<Punto>listaPuntos = new ArrayList<>();

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas para el punto referencia: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        listaPuntos.add(new Punto(x1, y1, z1));
        /*
        if (this instanceof Triangulo) {


            System.out.println("Ingrese las coordenadas del segundo punto: ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double z2 = sc.nextDouble();
            listaPuntos.add(new Punto(x2, y2, z2));

            System.out.println("Ingrese las coordenadas del tercer punto: ");
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double z3 = sc.nextDouble();
            listaPuntos.add(new Punto(x3, y3, z3));
        } else {
            System.out.println("Ingrese la componente x del punto: ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente y del punto: ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente z del punto: ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x, y, z));
        }*/
    }

    public double calcularDistancia(int i, int j){
        Punto punto1 = listaPuntos.get(i);
        Punto punto2 = listaPuntos.get(j);
        double dist = Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2)
                + Math.pow(punto1.getY()-punto2.getY(),2)
                + Math.pow(punto1.getZ()-punto2.getZ(),2));
        return dist;
    }
}
