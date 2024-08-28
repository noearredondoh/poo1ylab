// p36_ComprarPizza - Sistema de compra de una pizza

import java.util.Scanner;

public class p36_ComprarPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el tamaño de la pizza:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        int tamaño = scanner.nextInt();

        System.out.println("Elige la cantidad:");
        int cantidad = scanner.nextInt();

        double precio = getPrecio(tamaño);

        double totalCompra = precio * cantidad;
        double descuento = 0;
        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
        }

        double totalConDescuento = totalCompra - descuento;

        System.out.println("Tamaño de la compra: " + getTamaño(tamaño));
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
    }

    public static double getPrecio(int tamaño) {
        switch (tamaño) {
            case 1:
                return 5.0;
            case 2:
                return 10.0;
            case 3:
                return 20.0;
            default:
                return 0.0;
        }
    }

    public static String getTamaño(int tamaño) {
        switch (tamaño) {
            case 1:
                return "Chica";
            case 2:
                return "Mediana";
            case 3:
                return "Grande";
            default:
                return "";
        }
    }
}
