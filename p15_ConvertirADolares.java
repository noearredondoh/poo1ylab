// p15_ConvertirADolares - Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double COTIZACION_DOLAR = 18.78;

        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = sc.nextDouble();

        double dolares = pesos / COTIZACION_DOLAR;

        System.out.printf("El equivalente en dólares es: %.2f USD%n", dolares);
    }
    
}
