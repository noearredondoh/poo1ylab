package p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Compacto compacto1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Compacto compacto2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        Camioneta camioneta1 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Camioneta camioneta2 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(compacto1);
        vehiculos.add(compacto2);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);

        double sumaPrecios = 0;
        System.out.println("Datos de los Vehículos de la flota:\n");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            sumaPrecios += vehiculo.getPrecio();  
        }

        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        System.out.println("La suma de precios es: " + sumaPrecios);
    }
}
