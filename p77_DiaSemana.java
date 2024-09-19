// p77_DiaSemana - Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con
// letra.

import java.util.Scanner;

public class p77_DiaSemana {
    /**
     * Función que recibe un número entero entre 1 y 7 y devuelve el nombre del día de la semana.
     * @param dia Número entero que representa un día de la semana (1 a 7)
     * @return Nombre del día de la semana o un mensaje de error si el número está fuera del rango
     */
    public static String obtenerDiaSemana(int dia) {
        switch (dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Número fuera del rango (1-7)";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        System.out.print("Dame un número entre 1 y 7 y te diré el día de la semana: ");
        int dia = scanner.nextInt();

        if (dia >= 1 && dia <= 7) {
            System.out.println("El día de la semana es: " + obtenerDiaSemana(dia));
        } else {
            System.out.println("Error: El número ingresado está fuera del rango.");
        }

        System.out.println("\nGracias por utilizar este programa...");
    }
}
