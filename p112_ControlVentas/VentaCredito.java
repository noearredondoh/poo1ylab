package p112_ControlVentas;

public class VentaCredito extends Venta {
    private int Meses;
    private double Intereses;

    public VentaCredito(String articulo, int cantidad, double precio, int meses, double intereses) {
        super(articulo, cantidad, precio);
        Meses = meses;
        Intereses = intereses;
    }

    public double getTotalVenta() {
        Total = Total + (Total * Intereses);
        return Total;
    }

    public String toString() {
        return "VentaCredito ["+ super.toString() + "Meses=" + Meses + ", Intereses=" + Intereses + ", Total=" + getTotalVenta()
                + "]";
    }

     
}
