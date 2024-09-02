// p49_ParesDescendente - Se desea imprimir los números pares desde 100 hasta el número que el usuario decida (n)

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresa el número mínimo: ");
            int n = scanner.nextInt();

            String numerosPares = "";
            int suma = 0;
            int contador = 0;

            for (int i = 100; i >= n; i--) {
                if (i % 2 == 0) {
                    numerosPares += i + " ";
                    suma += i;
                    contador++;
                }
            }

            double promedio = (double) suma / contador;

            System.out.print("Números pares entre 100 y " + n + ": " + numerosPares);
            System.out.print(", la suma: " + suma);
            System.out.print(", el promedio: " + promedio);
            System.out.println(", ¿Deseas continuar (S/N)?");

            String respuesta = scanner.next();

            continuar = respuesta.equalsIgnoreCase("S");
        }

    }
}
