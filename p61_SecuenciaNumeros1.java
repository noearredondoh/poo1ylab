// p61_SecuenciaNumeros1 - Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee.

import java.util.Scanner;

public class p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Cuántos renglones? ");
        int r = obj.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        obj.close();
    }
}


