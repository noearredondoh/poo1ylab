package p104_PuntoCirculo;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo() {
        centro = new Punto();
        radio = 0.0;
    }

    public Circulo(Punto centroVal, double radioVal) {
        centro = centroVal;
        radio = radioVal;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centroVal) {
        centro = centroVal;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radioVal) {
        radio = radioVal;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + centro + ", Radio=" + radio + "]";
    }
}
