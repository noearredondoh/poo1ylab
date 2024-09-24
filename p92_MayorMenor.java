// p92_MayorMenor - Permita al usuario capturar n números en un arreglo de números enteros.

import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros ingresados:");
        Mostrar(numeros);

        int mayor = EncontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        int menor = EncontrarMenor(numeros);
        System.out.println("El número menor es: " + menor);
    }

    public static void Mostrar(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int EncontrarMayor(int[] arr) {
        int mayor = arr[0];
        for (int num : arr) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public static int EncontrarMenor(int[] arr) {
        int menor = arr[0];
        for (int num : arr) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
}
