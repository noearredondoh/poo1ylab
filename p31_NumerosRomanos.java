// p31_NumerosRomanos - Convierte un número entero de entre 1 y 10 a número romano

import java.util.Scanner;

public class p31_NumerosRomanos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Convierte un número entero de entre 1 y 10 a número romano ");
        int num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1 : System.out.println("I");break;
            case 2 : System.out.println("II");break;
            case 3 : System.out.println("III");break;
            case 4 : System.out.println("IV");break;
            case 5 : System.out.println("V");break;
            case 6 : System.out.println("VI");break;
            case 7 : System.out.println("VII");break;
            case 8 : System.out.println("VIII");break;
            case 9 : System.out.println("IX");break;
            case 10 : System.out.println("X");break;
        
            default:
                System.out.println("Número inválido !!!");
                break;
        }
        System.out.println("\nGracias por utilizar este sistema de conversiones tan complejo que hemos elaborado...");
    }
}
