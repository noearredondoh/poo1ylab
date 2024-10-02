package p105_PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo() {
        v1 = new Punto();
        v2 = new Punto();
        v3 = new Punto();
    }

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        v1 = vertice1;
        v2 = vertice2;
        v3 = vertice3;
    }

    public Punto getV1() {
        return v1;
    }

    public void setV1(Punto vertice1) {
        v1 = vertice1;
    }

    public Punto getV2() {
        return v2;
    }

    public void setV2(Punto vertice2) {
        v2 = vertice2;
    }

    public Punto getV3() {
        return v3;
    }

    public void setV3(Punto vertice3) {
        v3 = vertice3;
    }

    public double getPerimetro() {
        return v1.getDistancia(v2) + v2.getDistancia(v3) + v3.getDistancia(v1);
    }

    public String getTipo() {
        double d1 = v1.getDistancia(v2);
        double d2 = v2.getDistancia(v3);
        double d3 = v3.getDistancia(v1);

        if (d1 == d2 && d2 == d3) {
            return "Equilátero";
        } else if (d1 == d2 || d2 == d3 || d3 == d1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}