// p64_SumaTerminos2 - Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma:

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = sc.nextInt();
        
        int suma = 0;
        int termino = 0;
        
        System.out.print("Secuencia: ");
        for (int i = 1; i <= n; i++) {
            termino = termino * 10 + 1;  
            System.out.print(termino);
            if (i < n) {
                System.out.print(" + ");
            }
            suma += termino;
        }
        
        System.out.println("\nSuma: " + suma);
        sc.close();
    }
}
