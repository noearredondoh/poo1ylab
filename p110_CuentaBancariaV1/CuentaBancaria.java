package p110_CuentaBancariaV1;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double cantidad) {
        this.saldo = cantidad;
    }
    public void deposita(double cantidad) {
        saldo += cantidad;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean retira(double cantidad) {
        if( saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        else
        return false;
    }
}
