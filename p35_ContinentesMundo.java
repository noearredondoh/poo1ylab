// p35_ContinentesMundo - Dado un número entero entre 1 y 6 que corresponde a un continente del mundo

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 6: ");
        int numero = scanner.nextInt();

        String continente = encontrarContinente(numero);

        if (continente != null) {
            System.out.println("El continente es: " + continente);
        } else {
            System.out.println("Error: Número fuera del rango");
        }
    }

    public static String encontrarContinente(int numero) {
        switch (numero) {
            case 1:
                return "Asia";
            case 2:
                return "África";
            case 3:
                return "América del Norte";
            case 4:
                return "América del Sur";
            case 5:
                return "Antártida";
            case 6:
                return "Europa";
            default:
                return null;
        }
    }
}
