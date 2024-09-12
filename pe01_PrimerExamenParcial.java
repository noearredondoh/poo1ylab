// Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
//inscripción de los participantes y el dinero recaudado.

import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        final int COSTO_ALUMNO = 40;
        final int COSTO_DOCENTE = 60;
        final int COSTO_TRABAJADOR = 80;

        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalParticipantes = 0, totalRechazados = 0;
        int sumaEdades = 0;

        int dineroAlumnos = 0, dineroDocentes = 0, dineroTrabajadores = 0;

        Scanner scanner = new Scanner(System.in);
        char otraInscripcion = 'S';

        while (otraInscripcion == 'S') {
            System.out.print("Nombre del participante: ");
            String nombre = scanner.next();

            System.out.print("Edad del participante: ");
            int edad = scanner.nextInt();

            System.out.print("Sexo del participante (H/M): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Tipo de participante (Alumno, Docente, Trabajador): ");
            String tipoParticipante = scanner.next().toLowerCase();

            if (edad < 23) {
                System.out.println(nombre + " no cumple con la edad mínima para asistir al curso.");
                totalRechazados++;
            } else {
                totalParticipantes++;
                sumaEdades += edad;

                switch (tipoParticipante) {
                    case "alumno":
                        totalAlumnos++;
                        dineroAlumnos += COSTO_ALUMNO;
                        break;
                    case "docente":
                        totalDocentes++;
                        dineroDocentes += COSTO_DOCENTE;
                        break;
                    case "trabajador":
                        totalTrabajadores++;
                        dineroTrabajadores += COSTO_TRABAJADOR;
                        break;
                    default:
                        System.out.println("Tipo de participante no válido.");
                        totalParticipantes--; 
                        continue;
                }

                if (sexo == 'H') {
                    totalHombres++;
                } else if (sexo == 'M') {
                    totalMujeres++;
                } else {
                    System.out.println("Sexo no válido.");
                    totalParticipantes--; 
                    continue;
                }

                System.out.println("Bienvenido(a) " + nombre + " al curso de técnicas avanzadas de programación.");
            }

            System.out.print("¿Otra inscripción (S/N)? ");
            otraInscripcion = scanner.next().toUpperCase().charAt(0);
        }

        int totalDineroGeneral = dineroAlumnos + dineroDocentes + dineroTrabajadores;

        double promedioEdad = (totalParticipantes > 0) ? (double) sumaEdades / totalParticipantes : 0;

        System.out.println("\n--- Resumen de inscripciones ---");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de Participantes (excluyendo rechazados): " + totalParticipantes);
        System.out.println("Promedio de edad de los participantes: " + promedioEdad);
        System.out.println("Total de rechazados: " + totalRechazados);

        System.out.println("\n--- Resumen de dinero recaudado ---");
        System.out.println("Total dinero recaudado de Alumnos: $" + dineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: $" + dineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: $" + dineroTrabajadores);
        System.out.println("Total dinero en general: $" + totalDineroGeneral);

        if (totalDineroGeneral < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (totalDineroGeneral <= 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }

        scanner.close();
    }
}
