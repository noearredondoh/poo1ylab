// p37_CalculoNotas - Se desea calcular el promedio de 5 calificaciones introducidas por el usuario

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }

        double promedio = suma / 5;
        System.out.println("Promedio: " + promedio);

        String mensaje = evaluarPromedio(promedio);
        System.out.println(mensaje);
    }

    public static String evaluarPromedio(double promedio) {
        if (promedio > 0 && promedio <= 6) {
            return "Quedas reprobado";
        } else if (promedio > 6 && promedio <= 7) {
            return "Pasas de panzazo";
        } else if (promedio > 7 && promedio <= 8) {
            return "Muy bien, pues mejorar";
        } else if (promedio > 8 && promedio <= 9) {
            return "Excelente sigue así";
        } else if (promedio > 9 && promedio <= 10) {
            return "Perfecto tu esfuerzo valió la pena";
        } else {
            return "Promedio inválido";
        }
    }
}
