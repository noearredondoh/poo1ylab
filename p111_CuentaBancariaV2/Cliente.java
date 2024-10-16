package p111_CuentaBancariaV2;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<CuentaBancaria> cuentas;

    public Cliente() {
        cuentas = new ArrayList<>(); // reserva espacio en memoria para el arreglo de cuentas
    }

    public Cliente(String nombre) {
        this(); // invoca al constructor vacio de esta misma clase
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCuenta(CuentaBancaria cuenta){
        cuentas.add(cuenta);
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public double getTotal() {
        double total=0;
        for (CuentaBancaria cuenta : cuentas){
            total += cuenta.getSaldo();
        }
        return total;
    }
    
    public String toString() {
        return "Cliente [Nombre=" + nombre + ", Cuentas=" + cuentas.size() + ", Total =" + this.getTotal() + "]";
    }
}
