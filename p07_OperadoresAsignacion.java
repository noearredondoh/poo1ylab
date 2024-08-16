// p07_OperadoresAsignacion - Efectua diferentes operaciones usando los operadores de asignacion

import java.util.Scanner;

public class p07_OperadoresAsignacion {
   public static void main(String[] args) {
        System.out.print("\003[H\033[2J");System.out.flush();
        
        System.out.print("Dame un numero ? ");
        float num = new Scanner(System.in).nextFloat();

        System.out.printf("El numero original  : %.2f\n", num);
        System.out.printf("Incrementar en 1    : %.2f\n", ++num);
        System.out.printf("Sumar 80            : %.2f\n", num += 80);
        System.out.printf("Sumar 35            : %.2f\n", num -= 35);
        System.out.printf("Multiplicar x 15    : %.2f\n", num *= 15);
        System.out.printf("Dividir entre 4     : %.2f\n", num /= 4);
        System.out.printf("Decrementar 1       : %.2f\n", -- num);
   } 
}
