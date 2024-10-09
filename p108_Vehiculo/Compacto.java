package p108_Vehiculo;

public class Compacto extends Vehiculo {
    private int pasajeros;
    private int puertas;

    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertas) {
        super(serie, marca, año, precio);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto " + super.toString() + ", Pasajeros=" + pasajeros + ", Puertas=" + puertas;
    }
}

