// p25_EstacionesAño - Manda un mensaje en base al numero de estacion al año

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("\nDame un numero entre 1 y 4 y te dire que estacion del año es: ? ");
        int n = new Scanner(System.in).nextInt();

        if(n>=1 && n<=4){
            System.out.println("Chido");
            if(n==1) System.out.println("\nPrimavera");
            if(n==2) System.out.println("\nVerano");
            if(n==3) System.out.println("\nOtoño");
            if(n==4) System.out.println("\nInvierno");
        } else
            System.out.println("\nEsa estacion del año no existe !!! ");

        System.out.println("\n Vamonos al comedor ... > ...");
    }
    
}