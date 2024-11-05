import java.io.*;

public class p137_ArchivoDeportes {
    public static void main(String[] args) {
        String[] deportes = {"Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};
        File archivoDeportes = new File("deportes.txt");

        if (!archivoDeportes.exists()) {
            System.out.println("El archivo no existe, por lo tanto lo vamos a crear y escribir datos...");
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDeportes));
                for (String deporte : deportes) {
                    escritor.write(deporte + "\n");
                }
                escritor.close();
                System.out.println("Los datos han sido escritos en el archivo 'deportes.txt'.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe. Procediendo a leer los datos...");
        }

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoDeportes));
            String linea;
            System.out.println("Contenido del archivo 'deportes.txt':");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
