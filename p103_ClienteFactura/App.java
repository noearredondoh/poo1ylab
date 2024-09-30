package p103_ClienteFactura;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    
    public static Factura Llenar() {
        Factura f = new Factura(0, null, 0);  
        Cliente c = new Cliente(0, "", 0);     
        Scanner obj = new Scanner(System.in);

        System.out.println("Dame los datos de la factura y el cliente");
        System.out.print("Id Factura : ");
        f.setId(obj.nextInt());

        System.out.print("Monto      : ");
        f.setMonto(obj.nextDouble());

        System.out.print("Cliente Id : ");
        c.setId(obj.nextInt());
        obj.nextLine();  

        System.out.print("Cliente Nombre : ");
        c.setNombre(obj.nextLine());

        System.out.print("Cliente Desc (en %): ");
        c.setDescuento(obj.nextInt());  

        f.setCliente(c);
        return f;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        Factura f1 = new Factura(1, new Cliente(1, "Juan Perez", 3), 1500);
        Factura f2 = new Factura(2, new Cliente(2, "Maria Lopez", 1), 2300);

        facturas.add(f1);
        facturas.add(f2);

        System.out.print("\033[H\033[2J");  

        Factura f3 = Llenar();  
        System.out.println("Mi factura es: " + f3);
        facturas.add(f3);

        Factura f4 = Llenar();  
        System.out.println("Mi otra factura es: " + f4);
        facturas.add(f4);

        System.out.println("\n\nTodas las facturas:");
        double grantotal = 0;
        for (Factura factura : facturas) {
            System.out.println("Id Factura  : " + factura.getId());
            System.out.println("Monto       : " + factura.getMonto());
            System.out.println("Monto después de descuento: " + factura.getMontoDespuesDeDescuento());
            System.out.println("Cliente Id  : " + factura.getCliente().getId());
            System.out.println("Cliente Nombre : " + factura.getCliente().getNombre());
            System.out.println("Cliente Desc : " + factura.getCliente().getDescuento() + "%");
            grantotal += factura.getMonto();  
            System.out.println();
        }

        System.out.println("\nTotal Ventas = " + grantotal);
        
    }
}
