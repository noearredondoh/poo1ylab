// p12_ConvertirTemperatura -Convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Fahrenheit:");
        double fahrenheit = sc.nextDouble();
    
        double celsius = (fahrenheit - 32) * 5 / 9;
    
        System.out.println("La temperatura en grados Celsius es: " + celsius);  
    }

     
}
