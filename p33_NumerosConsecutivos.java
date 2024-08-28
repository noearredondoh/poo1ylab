// p33_NumerosConsecutivos - Dados tres números enteros, verificar si son consecutivos

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        if (sonConsecutivos(num1, num2, num3)) {
            System.out.println("Los números son consecutivos");
        } else {
            System.out.println("Error: Los números no son consecutivos");
        }
    }

    public static boolean sonConsecutivos(int num1, int num2, int num3) {
        return (num2 - num1 == 1) && (num3 - num2 == 1);
    }
}
    
        

    


