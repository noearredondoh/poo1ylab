// p14_CalculoTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = sc.nextInt();

        int dias = horas / 24;
        int horasRestantes = horas % 24;

        int minutos = horasRestantes * 60;
        int segundos = minutos * 60;

        System.out.println(horas + " horas equivalen a:");
        System.out.println(dias + " días");
        System.out.println(horasRestantes + " horas restantes");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");

    }
}
