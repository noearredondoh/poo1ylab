// p28_LeyDeNewton - Calcula la segunda ley de Newton

import java.util.Scanner;

public class p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m, a;
        char op;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elige lo que deseas calcular");
        System.out.println("[F]uerza      ( f = m * a)");
        System.out.println("[M]asa        ( m = f / a)");
        System.out.println("[A]celeracion ( a = f / m)");
        System.out.println("[S]alir del sistema...");
        System.out.print("Elige una opcion ? "); op = obj.next().charAt(0);
        op = Character.toUpperCase(op);
        f = m = a = 0;

        if (op == 'F') {
                        System.out.println("\nCalculando la Fuerza ...");
                        System.out.print("Masa ? ");
                        m = obj.nextFloat();
                        System.out.print("Aceleracion ? ");
                        a = obj.nextFloat();
                        f = m * a;
                        System.out.printf("\nFuerza: %.2f", f);
        } else if (op == 'M') {
                        System.out.println("\nCalculando la Masa ...");
                        System.out.print("Fuerza ? ");
                        f = obj.nextFloat();
                        System.out.print("Aceleracion ? ");
                        a = obj.nextFloat();
                        m = f / a;
                        System.out.printf("\nMasa: %.2f", m);
        } else if (op == 'A') {
                        System.out.println("\nCalculando la Aceleracion ...");
                        System.out.print("Fuerza ? ");
                        f = obj.nextFloat();
                        System.out.print("Masa ? ");
                        m = obj.nextFloat();
                        a = f / m;
                        System.out.printf("\nAceleración: %.2f", a);
        } else
        System.out.println("\nOpcion Invalida \n");
        }
    }

