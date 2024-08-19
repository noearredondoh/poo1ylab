// p13_VolumenCilindro - Calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = sc.nextDouble();

        double volumen = Math.PI * (radio * radio) * altura;

        System.out.println("El volumen del cilindro es: " + volumen);   
    }
    
}
