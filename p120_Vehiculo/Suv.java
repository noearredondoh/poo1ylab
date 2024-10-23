package p120_Vehiculo;

public class Suv implements Maquina, TodoTerreno {
    private String nombre;
    private String propietario;
    private int pasajeros;

    public Suv(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es una Suv");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna es una Suv");
    }
    @Override
    public void traccion4x4() {
        System.out.println("Es un automóvil con tracción 4 x 4 es una Suv");
    }
    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente es una Suv");
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
