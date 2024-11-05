package p139_ArchivoEstudiante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    public static void capturaDatos(ArrayList<Estudiante> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce datos de un Estudiante (nombre vacío para terminar): ");

        while (true) {
            Estudiante estudiante = new Estudiante();
            System.out.print("Nombre: ");
            estudiante.setNombre(obj.nextLine());
            if (estudiante.getNombre().isEmpty()) break;

            System.out.print("Edad: ");
            estudiante.setEdad(obj.nextInt());

            System.out.print("Promedio: ");
            estudiante.setPromedio(obj.nextDouble());

            System.out.print("Sexo (M/F): ");
            estudiante.setSexo(obj.next().charAt(0));
            obj.nextLine(); 

            datos.add(estudiante);
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Estudiante estudiante : datos) {
                writer.write(estudiante.getNombre() + "," + estudiante.getEdad() + "," +
                             estudiante.getPromedio() + "," + estudiante.getSexo() + "\n");
            }
            System.out.println("\nDatos grabados correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al grabar los datos en el archivo: " + e.getMessage());
        }
    }

    public static ArrayList<Estudiante> leerDatos(String archivo) {
        ArrayList<Estudiante> datos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    Estudiante estudiante = new Estudiante();
                    estudiante.setNombre(partes[0]);
                    estudiante.setEdad(Integer.parseInt(partes[1]));
                    estudiante.setPromedio(Double.parseDouble(partes[2]));
                    estudiante.setSexo(partes[3].charAt(0));
                    datos.add(estudiante);
                }
            }
            System.out.println("\nDatos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
        }
        return datos;
    }

    public static void mostrarDatos(ArrayList<Estudiante> datos) {
        System.out.println("\nLos datos de los estudiantes:");
        for (Estudiante estudiante : datos) {
            System.out.println(estudiante);
        }
    } 
}
