// p34_NumeroMayor - Dado tres numeros enteros, verificar cual es el mayor

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = encontrarMayor(num1, num2, num3);

        System.out.println("El mayor de los tres números es: " + mayor);
    }

    public static int encontrarMayor(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
    