package p106_Persona;

public class Apoyo extends Persona {
    private String Descripcion;
    private String Escalaridad;
    private double Paga;

    public Apoyo() {}

    public Apoyo(String nombre, String direccion, int edad, String descripcion, String escalaridad, double paga) {
        super(nombre, direccion, edad);
        Descripcion = descripcion;
        Escalaridad = escalaridad;
        Paga = paga;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEscalaridad() {
        return Escalaridad;
    }

    public void setEscalaridad(String escalaridad) {
        Escalaridad = escalaridad;
    }

    public double getPaga() {
        return Paga;
    }

    public void setPaga(double paga) {
        Paga = paga;
    }

    @Override
    public String toString() {
        return "Apoyo [" + super.toString() +", Descripcion=" + Descripcion + ", Escalaridad=" + Escalaridad + ", Paga=" + Paga + "]";
    }
    
    
    
}
