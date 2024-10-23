package p120_Vehiculo;

public class Sedan implements Maquina, Familiar {
    private String nombre;
    private String propietario;
    private int pasajeros;

    public Sedan(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es un Sedan");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna es un Sedan");
    }
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }
    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
    @Override
    public void repostar() {
        System.out.println("Repostando ...");
    }
    @Override
    public void arrancar() {
        System.out.println("Arrancando ...");
    }
    @Override
    public void frenar() {
        System.out.println("Frenando ...");
    }
    @Override
    public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }
}
