// p10_HipotenusaTriangulo - Calcular la hipotenusa de un triangulo

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double longitudLado1 = sc.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double longitudLado2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
