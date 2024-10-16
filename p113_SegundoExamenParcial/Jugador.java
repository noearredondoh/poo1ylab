package p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String nombre;
    protected char sexo;
    protected String descripcion;
    protected double salario;
    protected double total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public abstract double getBono();

    public String toString() {
        return "Jugador [Nombre=" + nombre + ", Sexo=" + sexo + ", Descripcion=" + descripcion + ", Salario=" + salario + "]";
    }
}
