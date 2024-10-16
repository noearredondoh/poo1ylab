package p111_CuentaBancariaV2;

public abstract class CuentaBancaria { // la clase podra ser heredada, pero no puedo crear objetos de esta clase
    protected double saldo; // permite que sea modificado por las clases que la heredan

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double cantidad) {
        saldo = cantidad + cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract boolean retira(double cantidad);
}
