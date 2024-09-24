// p90_Temperaturas - Declare un arreglo de números flotantes llamado temperaturas y que lo inicialice los siguientes elementos:
// 2.34 44.56 7.89 0.5 2.5 4.67 40.3 22.35 56.22

import java.util.Random;

public class p90_Temperaturas {
    public static void Mostrar(float[] nums) {
        for (float n : nums)
            System.out.printf("%.2f ", n);
        System.out.println("\n");
    }

    public static void PonerCeroMayoresADiez(float[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 10) {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};
        
        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("Primer elemento: " + temperaturas[0]);

        System.out.println("Tercer elemento: " + temperaturas[2]);

        System.out.println("Elementos del arreglo:");
        Mostrar(temperaturas);

        PonerCeroMayoresADiez(temperaturas);

        System.out.println("Elementos después de poner a 0 los mayores a 10:");
        Mostrar(temperaturas);
    }
}
