// p21_VerificarNumero - Verificar si es un numero es positivo o negativo

import java.util.Scanner;

public class p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        System.out.println("Verificar si un numero es positivo negativo o cero \n");
        System.out.println("Dame un numero entero ? ");
        int numero =  new Scanner(System.in).nextInt();

        if(numero>0) System.out.println("El numero es POSITIVO");
        if(numero<0) System.out.println("El número es NEGATIVO");
        if(numero==0) System.out.println("El número es CERO");

        System.out.println("\nGracias por utilizar este programa\n");
    }
}
