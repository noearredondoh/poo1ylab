// p80_Angulo - Diseña un programa con una función que reciba como parámetro un ángulo entre 0 y 360 grados.

import java.util.Scanner;

public class p80_Angulo {
    /**
     * Función que recibe un ángulo y devuelve una cadena con el tipo de ángulo.
     * @param angulo El ángulo en grados (0 a 360)
     * @return El tipo de ángulo: "Agudo", "Recto", "Obtuso", "Llano", "Cóncavo", o "Completo"
     */
    public static String tipoDeAngulo(int angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else if (angulo == 360) {
            return "Completo";
        } else {
            return "Ángulo no válido";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un ángulo entre 0 y 360 grados y te diré su tipo: ");
        int angulo = scanner.nextInt();
        
        if (angulo < 0 || angulo > 360) {
            System.out.println("Error: Ángulo fuera del rango permitido.");
        } else {
            System.out.println("El tipo de ángulo es: " + tipoDeAngulo(angulo));
        }

        System.out.println("\nGracias por utilizar este programa.");
    }
}
