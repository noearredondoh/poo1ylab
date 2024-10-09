package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033(2J");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + c1.getSaldo());
        c1.deposita(1000);
        System.out.println("Saldo despues del 1er deposito " + c1.getSaldo());
        double cr = 400;
        boolean ran = c1.retira(cr);
        if(ran) System.out.println("Retirate " + cr + "te quedan" + c1.getSaldo());
        else System.out.println("No tienes ni para los cigarros, ponte a trabajar");

        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 91 " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mujer = new Cliente("Rocio", cliente2.getCuenta());
        mujer.getCuenta().retira(10100);
        System.out.println(cliente2);

        System.out.println("\nProbando la clase banco");
        Banco miBanco = new Banco("Banco del Bienestar", "Campues Siglo XXI");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        miBanco.agregarCliente(mujer);
        miBanco.agregarCliente(new Cliente("Claudia la Presi", new CuentaBancaria(1000000)));
        miBanco.getClientes().get(3).getCuenta().retira(90000);
        miBanco.getClientes().get(0).getCuenta().deposita(30000);
        miBanco.getClientes().get(1).getCuenta().deposita(30000);
        miBanco.getClientes().get(2).getCuenta().deposita(30000);
        System.out.println("Los clientes del banco");
        double total = 0;
        for(Cliente cte : miBanco.getClientes()) {
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
        }

        System.out.printf("Total de dinero en el banco %.2f", total);
    }
}
