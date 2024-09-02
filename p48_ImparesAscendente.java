// Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n)

import java.util.Scanner;

public class p48_ImparesAscendente {
   public static void main(String[] args) {
    System.out.print("\033[H\033[2J");System.out.flush();
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
        System.out.print("Ingresa el número máximo: ");
        int n = scanner.nextInt();

        String numerosImpares = "";
        int suma = 0;
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                numerosImpares += i + " ";
                suma += i;
                contador++;
            }
        }

        double promedio = (double) suma / contador;

        System.out.println("Números impares entre 1 y " + n + ": " + numerosImpares);
        System.out.println("La suma: " + suma);
        System.out.println("El promedio: " + promedio);

        System.out.print("¿Deseas continuar (S/N)? ");
        String respuesta = scanner.next();

        continuar = respuesta.equalsIgnoreCase("S");
    }

    }
} 

