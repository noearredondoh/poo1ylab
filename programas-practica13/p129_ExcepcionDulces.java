import java.util.Scanner;
import java.util.InputMismatchException;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Número de niños en el barrio: ");
            int ninos = scanner.nextInt();

            System.out.print("Cantidad de dulces existente: ");
            int dulces = scanner.nextInt();

            if (dulces == 0) {
                System.out.println("Si no hay dulces, no puedo repartir dulces.");
            } else {
                int dulcesPorNino = dulces / ninos;
                System.out.printf("A cada niño le tocan %d dulces.%n", dulcesPorNino);
            }

        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas.");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay niños, no puedo repartir dulces.");
        } finally {
            scanner.close();
        }
    }
}
