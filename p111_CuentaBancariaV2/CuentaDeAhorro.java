package p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria {
    private double tasainteres;

    public CuentaDeAhorro(double cantidad, double tasainteres) {
        super(cantidad); // invoca al constructor de la clase baja
        this.tasainteres = tasainteres;
    }

    public void calcularInteres(){
        saldo += saldo * tasainteres;

    }
    public boolean retira(double cantidad) {
        if (saldo >= cantidad){
            saldo -= cantidad;
            return true;
        }
        else return false;
    }
    public String toString() {
        return "CuentaDeAhorro [saldo =" + super.getSaldo() + "tasainteres=" + tasainteres + "]";
    }
}
