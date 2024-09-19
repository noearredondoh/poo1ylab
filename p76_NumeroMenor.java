// p76_NumeroMenor - Diseña un programa con una función que pida 4 números enteros y devuelva el menor de ellos.

import java.util.Scanner;

public class p76_NumeroMenor {
    /**
     * Función que recibe cuatro números enteros y devuelve el menor de ellos.
     * @param n1 Primer número entero
     * @param n2 Segundo número entero
     * @param n3 Tercer número entero
     * @param n4 Cuarto número entero
     * @return El menor de los cuatro números enteros
     */
    public static int Menor(int n1, int n2, int n3, int n4) {
        int menor = n1; // Inicialmente asumimos que n1 es el menor
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        return menor;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame cuatro números separados por espacio: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        n4 = obj.nextInt();
        
        System.out.printf("\nEl menor de los cuatro números es: %d", Menor(n1, n2, n3, n4));
    }
}
