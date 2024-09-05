// p63_SumaTerminos1 - Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma:

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();
        
        double suma = 0.0;
        
        System.out.print("Secuencia: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
            suma += 1.0 / i;
        }
        
        System.out.printf("\nSuma: %.15f\n", suma);
        sc.close();
    }
}
