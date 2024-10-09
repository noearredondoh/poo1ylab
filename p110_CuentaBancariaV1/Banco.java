package p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String domicilio;
    private ArrayList<Cliente> clientes;

    public Banco () {
        clientes = new ArrayList<>();
    }
    public Banco(String Nombre, String Domicilo) {
        this(); // Invoca al constructor vacio de la misma clase
        this.nombre = Nombre;
        this.domicilio = Domicilo;
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", Domicilio=" + domicilio + ", Clientes=" + clientes.size() + "]";
    }
    
}
