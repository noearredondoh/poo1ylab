// p79_SumaMultiplos - Diseña un programa con una función que reciba tres parámetros.

import java.util.Scanner;

public class p79_SumaMultiplos {
    /**
     * Función que recibe un rango (ini, fin) y una constante (3 o 4), y devuelve la suma de los múltiplos de la constante en ese rango.
     * @param ini Valor inicial del rango
     * @param fin Valor final del rango
     * @param multiplo El número del cual se sumarán los múltiplos (3 o 4)
     * @return La suma de los múltiplos de 3 o 4 en el rango especificado
     */
    public static int SumaMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, multiplo, suma;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Suma de Múltiplos de 3 o 4 en un Rango");
            System.out.print("Valor inicial del rango: ");
            ini = obj.nextInt();
            System.out.print("Valor final del rango: ");
            fin = obj.nextInt();

            if (ini >= fin) {
                System.out.println("Error: El valor inicial debe ser menor que el valor final.");
                continue;
            }

            System.out.println("\nElige el múltiplo:");
            System.out.println("1. Múltiplos de 3");
            System.out.println("2. Múltiplos de 4");
            System.out.print("Opción: ");
            int opcion = obj.nextInt();

            if (opcion == 1) {
                multiplo = 3;
                System.out.println("Sumando múltiplos de 3 entre " + ini + " y " + fin);
            } else if (opcion == 2) {
                multiplo = 4;
                System.out.println("Sumando múltiplos de 4 entre " + ini + " y " + fin);
            } else {
                System.out.println("Opción no válida.");
                continue;
            }

            suma = SumaMultiplos(ini, fin, multiplo);
            System.out.printf("\nLa suma de los múltiplos de %d es: %d\n", multiplo, suma);

            System.out.println("\n¿Quieres hacer otra operación? (s/n)");
            obj.nextLine(); // Limpiar el buffer
        } while (obj.nextLine().equalsIgnoreCase("s"));

        System.out.println("Gracias por usar este programa.");
    }
}
