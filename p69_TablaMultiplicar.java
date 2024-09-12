// p69_TablaMultiplicar - Imprime la tabla de multiplicar hasta que el usuario quiera hasta donde el quiera

import java.util.Scanner;

public class p69_TablaMultiplicar {

    public static void Tabla(int tabla, int limite) {
        for(int i=1; i<=limite; i++)
            System.out.printf("%d x %d = %d \n", tabla, i, tabla * 1);
        System.out.println();
    
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);

        System.out.print("Que tabla quieres ? "); int tabla = obj.nextInt();
        System.out.print("Hasta donde       ? "); int limite = obj.nextInt();

        Tabla(tabla, limite);

    }
}
