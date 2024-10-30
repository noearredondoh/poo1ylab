import java.util.Scanner;
import java.util.InputMismatchException;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];
        int i = 0;

        System.out.println("Captura las edades de 5 personas:");

        while (i < 5) {
            System.out.print("Edad persona " + (i + 1) + ": ");
            try {
                edades[i] = scanner.nextInt();
                i++; 
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                scanner.next(); 
            }
        }

        System.out.print("Captura terminada las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
