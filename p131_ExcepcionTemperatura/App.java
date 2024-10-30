package p131_ExcepcionTemperatura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static double convertirAFahrenheit(double centigrados) throws TemperaturaExcesiva {
        if (centigrados > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return (centigrados * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); 

        while (true) {
            try {
                System.out.print("Dame una temperatura en centigrados: ");
                double centigrados = scanner.nextDouble();

                double fahrenheit = convertirAFahrenheit(centigrados);
                System.out.printf("%.2f grados centigrados, equivale a %.2f grados fahrenheit%n", centigrados, fahrenheit);
                break; 

            } catch (InputMismatchException e) {
                System.out.println("La temperatura a convertir, debe ser un valor numérico");
                scanner.next(); 

            } catch (TemperaturaExcesiva e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
