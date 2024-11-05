import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class p138_ArchivoMaterias {
    public static void capturarMaterias(ArrayList<String> materias) {
        String materia;
        System.out.println("\nIntroduce el nombre de una materia y presiona <Enter> (deja vacío para terminar): ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            materia = scanner.nextLine();
            if (!materia.isEmpty()) {
                materias.add(materia);
            } else {
                break;
            }
        }
    }

    public static void grabarMaterias(String archivo, ArrayList<String> materias) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (String materia : materias) {
                writer.write(materia + "\n");
            }
            System.out.println("\nLas materias han sido grabadas correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("\nError al grabar las materias en el archivo: " + e.getMessage());
        }
    }

    public static ArrayList<String> leerMaterias(String archivo) {
        ArrayList<String> materias = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String materia;
            while ((materia = reader.readLine()) != null) {
                materias.add(materia);
            }
            System.out.println("\nLas materias han sido cargadas correctamente desde el archivo.");
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo: " + e.getMessage());
        }
        return materias;
    }

    public static void mostrarMaterias(ArrayList<String> materias) {
        System.out.println("\nMaterias capturadas:");
        for (String materia : materias) {
            System.out.println(materia);
        }
    }

    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        String archivo = "materias.txt";
        ArrayList<String> materias = new ArrayList<>();
        
        do {
            System.out.println("----- Gestión de Materias Cursadas -----");
            System.out.println("Capturar materias ................. [1]");
            System.out.println("Grabar materias en archivo ........ [2]");
            System.out.println("Leer materias del archivo ......... [3]");
            System.out.println("Mostrar materias .................. [4]");
            System.out.println("Salir ............................. [5]");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\nCaptura de materias");
                    capturarMaterias(materias);
                    break;
                case 2:
                    if (!materias.isEmpty()) {
                        grabarMaterias(archivo, materias);
                    } else {
                        System.out.println("\nNo hay materias para grabar, captura algunas antes.");
                    }
                    break;
                case 3:
                    materias = leerMaterias(archivo);
                    break;
                case 4:
                    if (!materias.isEmpty()) {
                        mostrarMaterias(materias);
                    } else {
                        System.out.println("\nNo hay materias para mostrar, captura o lee datos del archivo.");
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println("\n<Presiona Enter para continuar>");
            scanner.nextLine();
        } while (opcion != 5);
        
        scanner.close();
    }
}
