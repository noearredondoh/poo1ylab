package p108_Vehiculo;

public class Camioneta extends Vehiculo {
    private double capacidad;
    private int ejes;

    public Camioneta(String serie, String marca, int año, double precio, double capacidad, int ejes) {
        super(serie, marca, año, precio);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camioneta " + super.toString() + ", Capacidad=" + capacidad + ", Ejes=" + ejes;
    }
}
