// p38_AceptarEstudianteV2 - Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado.

import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el sexo (h/m): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }

        double promedio = suma / 3;

        boolean esAceptado = evaluarAceptacion(sexo, edad, promedio);

        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + (sexo == 'h' ? "Hombre" : "Mujer"));
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aceptado: " + (esAceptado ? "Sí" : "No"));
    }

    public static boolean evaluarAceptacion(char sexo, int edad, double promedio) {
        return sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5;
    }
}
