// p78_MedidasLongitud - Diseña un programa con dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros a
// pies.

import java.util.Scanner;

public class p78_MedidasLongitud {
    /**
     * Función que convierte pulgadas a centímetros.
     * @param pulgadas Valor en pulgadas
     * @return El valor convertido en centímetros
     */
    public static float pulgadasACentimetros(float pulgadas) {
        return pulgadas * 2.54f;
    }

    /**
     * Función que convierte metros a pies.
     * @param metros Valor en metros
     * @return El valor convertido en pies
     */
    public static float metrosAPies(float metros) {
        return metros * 3.281f;
    }

    public static void main(String[] args) {
        int op;
        float valor;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Conversión de Unidades");
            System.out.println("1. Pulgadas a Centímetros");
            System.out.println("2. Metros a Pies");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Convertir de Pulgadas a Centímetros");
                    System.out.print("Dame el valor en pulgadas: ");
                    valor = obj.nextFloat();
                    System.out.println("El resultado es: " + pulgadasACentimetros(valor) + " cm");
                    break;
                case 2:
                    System.out.println("Convertir de Metros a Pies");
                    System.out.print("Dame el valor en metros: ");
                    valor = obj.nextFloat();
                    System.out.println("El resultado es: " + metrosAPies(valor) + " pies");
                    break;
                case 3:
                    System.out.println("\nGracias por utilizar este programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            if (op != 3) {
                System.out.println("\n<Presiona cualquier tecla para continuar>");
                obj.nextLine();  // Limpiar buffer
                obj.nextLine();  // Esperar una tecla
            }
        } while (op != 3);

        System.out.println("\nPrograma terminado.");
    }
}
