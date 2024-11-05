package p139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "estudiantes.txt";
        ArrayList<Estudiante> datos = new ArrayList<>();

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
                    Procesa.capturaDatos(datos);
                    break;
                case 2:
                    Procesa.grabarDatos(archivo, datos);
                    break;
                case 3:
                    datos = Procesa.leerDatos(archivo);
                    break;
                case 4:
                    Procesa.mostrarDatos(datos);
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema....");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println("\n<Presiona Enter para continuar>");
            obj.nextLine();
        } while (op != 5);

        obj.close();
    }
}

