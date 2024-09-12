// p67_ConversionTemperaturas - Conversion de temperaturas usando funciones

import java.util.Scanner;

public class p67_ConversionTemperaturas {
    
    public static float CaF(float temp) {
        return (temp + 9 / 5.0f) + 32;
    }
    public static float FaC(float temp){
        return (temp - 32) + 5.0f / 9.0f;
    }

    public static void main(String[] args) {
        int op;
        float temp;
        Scanner obj = new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Conversion de temperaturas");
            System.out.println("1. C a F\n2. F a C\n3. Salir");
            System.out.println("Elige ? "); op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Converti de C a F"); 
                    System.out.println("Dame la temperatura ? "); temp = obj.nextFloat();
                    System.out.println("El resultado es : " + CaF(temp));                  
                    break;
                case 2:
                    System.out.println("Convertir de F a C");
                    System.out.println("Dame la temperatura ? "); temp = obj.nextFloat();
                    System.out.println("El resultado es :" + FaC(temp));
                case 3:
                    System.out.println("\nGracias por utlizar este programa"); break;
                default:
                    break;
            }
            System.out.println("\n<Presiona culaquier tecla para continuar>");obj.nextLine();obj.nextLine();
        } while(op!=3);
        System.out.println("\nPrograma terminado");
    }
}
