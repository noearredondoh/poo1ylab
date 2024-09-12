// p68_SumaRnago - Suma de un rango de numeros

import java.util.Scanner;

public class p68_SumaRango {

    public static int SumaRango(int ini, int fin){
        int suma=0;
        for(int i=ini; i <= fin; i++ ){
            suma = suma +1;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        int suma=0, ini, fin;

        do{
            System.out.println("Dame el inicio ? "); ini = obj.nextInt();
            System.out.println("Dame el fin    ?"); fin = obj.nextInt();
        } while( ini > fin);

        suma = SumaRango(ini, fin);
        
        System.out.println("\nLa suma del rango es " + suma);
    }
}
