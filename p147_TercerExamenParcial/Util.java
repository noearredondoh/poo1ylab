package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Jugador("Carlos", 25, 'M', "Soltero", "Delantero", 50000));
        jugadores.add(new Jugador("Lucía", 28, 'F', "Casada", "Defensora", 55000));
        jugadores.add(new Jugador("Pedro", 30, 'M', "Divorciado", "Portero", 60000));
        
        return jugadores;
    }

    public static void serializarDatos(String nombreArchivo, ArrayList<Jugador> jugadores) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(jugadores);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> desSerializarDatos(String nombreArchivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> jugadores;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            jugadores = (ArrayList<Jugador>) ois.readObject();
        }
        return jugadores;
    }
}

