// p39_Numeros1a100 - Imprimir numeros de 1 a 100 con while

import java.util.Scanner;

public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Imprimiendo los numeros de 0 a n ");
        System.out.print("Hasta donde      ? "); int n = new Scanner(System.in).nextInt();
        System.out.println("En incremento de ? "); int i = new Scanner(System.in).nextInt();

        int c = 0;
        while (c <= n){
            System.out.printf("Chilquil %d\n ",c);
            c = c + i;
        }

        System.out.println("\nEl ciclo ha terminado");
        System.out.println(c);
    }
    
}