package p108_Vehiculo;

public class Vehiculo {
    private String serie;
    private String marca;
    private int año;
    private double precio;

    public Vehiculo(String serie, String marca, int año, double precio) {
        this.serie = serie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;  // Este método debe devolver el precio correcto
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + serie + ", Marca=" + marca + ", Año=" + año + ", Precio=" + precio + "]";
    }
}

