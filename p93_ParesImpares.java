// p93_ParesImpares - Declare dos arreglos de números enteros de una cantidad MAX 100 (a[MAX], b[MAX])

import java.util.Random;

public class p93_ParesImpares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        final int MAX = 100;  
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        
        RellenarArreglo(a);
        
        System.out.println("Elementos del arreglo a[]:");
        MostrarArreglo(a);
        
        int conteoPares = MostrarPares(a);
        System.out.println("Cantidad de números pares: " + conteoPares);
        
        int conteoImpares = MostrarImpares(a);
        System.out.println("Cantidad de números impares: " + conteoImpares);
    }

    public static void RellenarArreglo(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(21); 
        }
    }

    public static void MostrarArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int MostrarPares(int[] arr) {
        int conteo = 0;
        System.out.println("Números pares en el arreglo:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                conteo++;
            }
        }
        System.out.println();  
        return conteo;
    }

    public static int MostrarImpares(int[] arr) {
        int conteo = 0;
        System.out.println("Números impares en el arreglo:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                conteo++;
            }
        }
        System.out.println(); 
        return conteo;
    }
}
