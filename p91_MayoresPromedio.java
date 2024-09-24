// p91_MayoresPromedio - Permita al usuario capturar n calificaciones en un arreglo de números flotantes.

import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        int n = sc.nextInt();
        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextFloat();
        }

        System.out.println("\nCalificaciones ingresadas:");
        Mostrar(calificaciones);

        float suma = CalcularSuma(calificaciones);
        float promedio = suma / n;
        System.out.printf("\nSuma de calificaciones: %.2f\n", suma);
        System.out.printf("Promedio de calificaciones: %.2f\n", promedio);

        int conteoMayores = MostrarMayoresAlPromedio(calificaciones, promedio);
        System.out.println("\nCantidad de calificaciones mayores al promedio: " + conteoMayores);
    }

    public static void Mostrar(float[] arr) {
        for (float num : arr) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();
    }

    public static float CalcularSuma(float[] arr) {
        float suma = 0;
        for (float num : arr) {
            suma += num;
        }
        return suma;
    }

    public static int MostrarMayoresAlPromedio(float[] arr, float promedio) {
        int conteo = 0;
        System.out.println("\nCalificaciones mayores al promedio:");
        for (float num : arr) {
            if (num > promedio) {
                System.out.printf("%.2f ", num);
                conteo++;
            }
        }
        System.out.println();
        return conteo;
    }
}
