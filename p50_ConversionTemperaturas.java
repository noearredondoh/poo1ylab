// p50_ConversionTemperaturas - Se desea calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int tempInicial, tempFinal, c;
        char resp;    
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("Tabla de conversión de grados Centígrados a Fahrenheit");
        
        do {
            System.out.print("Temperatura Inicial: ");
            tempInicial = obj.nextInt();
            System.out.print("Temperatura Final: ");
            tempFinal = obj.nextInt();
        } while (tempFinal < tempInicial); 

        c = tempInicial;
        System.out.println("Centígrados \t Fahrenheit");
        System.out.println("---------------------------");
        while (c <= tempFinal) {
            double fahrenheit = (c * 9.0 / 5.0) + 32;
            System.out.printf("%10d \t %10.1f\n", c, fahrenheit);
            c++;
        }
        System.out.println("---------------------------");

        System.out.print("\n¿Deseas continuar (S/N)? ");
        resp = Character.toUpperCase(obj.next().charAt(0));
        
        if (resp == 'N') {
            System.out.println("\nGracias por utilizar este programa!");
        }
    }
    
}

