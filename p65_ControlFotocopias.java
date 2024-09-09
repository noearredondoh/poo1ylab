// p65_RepasoParcial1 - Una empresa fotocopiadora requiere un programa que le permita llevar el control de su venta de
// fotocopias.

import java.util.Scanner;

public class p65_ControlFotocopias{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        final int PRECIO_CARTA = 3; // 'final' asegura que los precios sean constantes e inmutables.
        final int PRECIO_OFICIO = 4;
        final int PRECIO_DOBLE_OFICIO = 6;

        int totalCarta = 0, totalOficio = 0, totalDobleOficio = 0;
        int totalVenta = 0;
        int ventasRealizadas = 0;

        Scanner scanner = new Scanner(System.in);
        char otraVenta = 'S';

        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");

        do {
            ventasRealizadas++;
            System.out.println("Venta: " + ventasRealizadas);
            System.out.print("Tipo de copia (C)arta $3, (O)ficio $4, (D)oble Of $6? ");
            char tipoCopia = scanner.next().toUpperCase().charAt(0);

            System.out.print("Cantidad ? ");
            int cantidad = scanner.nextInt();

            switch (tipoCopia) {
                case 'C':
                    totalCarta += cantidad;
                    totalVenta += cantidad * PRECIO_CARTA;
                    break;
                case 'O':
                    totalOficio += cantidad;
                    totalVenta += cantidad * PRECIO_OFICIO;
                    break;
                case 'D':
                    totalDobleOficio += cantidad;
                    totalVenta += cantidad * PRECIO_DOBLE_OFICIO;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    ventasRealizadas--; 
                    continue;
            }

            System.out.print("Otra venta (S/N) ? ");
            otraVenta = scanner.next().toUpperCase().charAt(0);

        } while (otraVenta == 'S');

        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("-------------------------");
        System.out.println("Carta    : " + totalCarta + " - $ " + (totalCarta * PRECIO_CARTA));
        System.out.println("Oficio   : " + totalOficio + " - $ " + (totalOficio * PRECIO_OFICIO));
        System.out.println("Doble Of.: " + totalDobleOficio + " - $ " + (totalDobleOficio * PRECIO_DOBLE_OFICIO));
        System.out.println("-------------------------");
        System.out.println("Tot. Ventas : " + (totalCarta + totalOficio + totalDobleOficio) + " - $ " + totalVenta);

        if (totalVenta < 50) {
            System.out.println("Esta venta es una : Venta moderada");
        } else if (totalVenta >= 50 && totalVenta <= 100) {
            System.out.println("Esta venta es una : Venta frecuente");
        } else {
            System.out.println("Esta venta es una : Venta superada");
        }

        scanner.close();
    }
    
}

