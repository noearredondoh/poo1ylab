// p11_CalcularAngulo - Calcular 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer ángulo: ");
        double angulo1 = sc.nextDouble();

        System.out.print("Ingrese el segundo ángulo: ");
        double angulo2 = sc.nextDouble();

        double angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("El tercer ángulo es: " + angulo3);
    }
}
