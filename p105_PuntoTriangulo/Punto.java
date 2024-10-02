package p105_PuntoTriangulo;

public class Punto {
    private int x;
    private int y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(int xVal, int yVal) {
        x = xVal;
        y = yVal;
    }

    public int getX() {
        return x;
    }

    public void setX(int xVal) {
        x = xVal;
    }

    public int getY() {
        return y;
    }

    public void setY(int yVal) {
        y = yVal;
    }

    public double getDistancia(Punto punto) {
        return Math.sqrt(Math.pow((punto.getX() - x), 2) + Math.pow((punto.getY() - y), 2));
    }

    @Override
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}
