package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.total;
        }
        return total;
    }

    public int getTotalHombres() {
        int count = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.sexo == 'H') count++;
        }
        return count;
    }

    public int getTotalMujeres() {
        int count = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.sexo == 'M') count++;
        }
        return count;
    }

    public void reporte() {
        System.out.println("Equipo [Nombre=" + nombre + ", Liga=" + liga + ", Jugadores=" + jugadores.size() +
                           ", Bono=" + getTotalBono() + ", Total=" + getTotal() +
                           ", Hombres=" + getTotalHombres() + ", Mujeres=" + getTotalMujeres() + "]");
        
        for (Jugador jugador : jugadores) {
            System.out.println(" - " + jugador);
        }
    }
}
