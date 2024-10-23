package p120_Vehiculo;

public class App {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        
        Sedan sedan = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(sedan);
        sedan.sistemaElectrico();
        sedan.combustionInterna();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();

        System.out.println();

        Suv suv = new Suv("La mamalona", "Carlos Castaneda", 6);
        System.out.println(suv);
        suv.sistemaElectrico();
        suv.combustionInterna();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}
