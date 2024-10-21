package p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego{
    private int num, intentos;

    @Override
    public void iniciar() {
        num = 1 + (int) (Math.random()*100);
        
    }

    @Override
    public void jugar() {
        int num = 0;
        do {
            System.out.print("\nDame un numero entre 1 y 100 ? "); num = new Scanner(System.in).nextInt();
            if(this.num < num) System.out.println("Mas abajo..");
            else if(this.num > num) System.out.println("Mas arriba..");
            intentos ++;
        }while(this.num != num);
        
    }

    @Override
    public void finalizar() {
        System.out.println("\n" + this.num + " era el numero !!!. ganaste despues de " + intentos + " intentos !");
        
    }
}
