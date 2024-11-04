import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class p135_Archivos4 {
    public static void capturarDatos(ArrayList<String> datos) {
         String dato = "";
        System.out.println("\nIntroduce un dato y presiona <Enter> (dato vacío para terminar): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            dato = scanner.nextLine();
            if (!dato.isEmpty()) datos.add(dato);
            else break;
        }
    }

    public static void grabarDatos(String archivo, ArrayList<String> datos) throws IOException {
        try (BufferedWriter fdatos = new BufferedWriter(new FileWriter(archivo))) {
            for (String dato : datos) {
                fdatos.write(dato + "\n");
            }
            System.out.println("\nDatos grabados correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al grabar los datos en el archivo: " + e.getMessage());
        }
    }

    public static ArrayList<String> leerDatos(String archivo) {
        ArrayList<String> datos = new ArrayList<>();
        try (BufferedReader fdatos = new BufferedReader(new FileReader(archivo))) {
            String dato;
            while ((dato = fdatos.readLine()) != null) {
                datos.add(dato);
            }
            System.out.println("\nDatos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
        }
        return datos;
    }

    public static void mostrarDatos(ArrayList<String> datos) {
        System.out.println("\nLos datos hasta el momento:");
        for (String dato : datos) {
            System.out.println(dato);
        }
    }

    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "datos.txt";
        ArrayList<String> datos = new ArrayList<>();
        
        do {
            System.out.println("----- Procesamiento de datos ---------------");
            System.out.println("Capturar datos ....................... [1]");
            System.out.println("Grabar datos en archivo ........... [2]");
            System.out.println("Leer datos de archivo ............ [3]");
            System.out.println("Mostrar datos ....................... [4]");
            System.out.println("Salir ................................... [5]");
            System.out.print("Elige opción: ");
            op = obj.nextInt();
            obj.nextLine(); 

            switch (op) {
                case 1:
                    if (datos.isEmpty()) {
                        System.out.println("\nSe capturan datos por primera vez\n");
                    } else {
                        System.out.println("\nLos datos a capturar se agregan a los datos existentes\n");
                    }
                    capturarDatos(datos);
                    break;
                case 2:
                    if (!datos.isEmpty()) {
                        try {
                            grabarDatos(archivo, datos);
                        } catch (IOException e) {
                            System.out.println("\nError al grabar los datos en el archivo.");
                        }
                    } else {
                        System.out.println("\nNo hay datos para grabar, captura datos antes.");
                    }
                    break;
                case 3:
                    datos = leerDatos(archivo);
                    break;
                case 4:
                    if (!datos.isEmpty()) {
                        mostrarDatos(datos);
                    } else {
                        System.out.println("\nNo hay datos para mostrar, captura datos o lee datos del disco.");
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema.... \n");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            System.out.println("\n<Presiona Enter para continuar>");
            obj.nextLine();
        } while (op != 5);
        
        obj.close();
    }
}
