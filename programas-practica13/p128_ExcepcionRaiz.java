import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            float numero = scanner.nextFloat();

            if (numero < 0) {
                throw new Exception("Error: no se puede calcular la raíz cuadrada de un número negativo.");
            }

            double resultado = Math.sqrt(numero);
            System.out.printf("El resultado es: %.2f%n", resultado);
        } catch (Exception e) {
            System.out.println("Error: no puedo calcular la raíz cuadrada.");
        } finally {
            scanner.close();
        }
    }
}
