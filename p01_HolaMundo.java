/**
 * p01_HolaMundo - Manda una salida a la pantalla
 */
public class p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Adrian";
        String hermano = "Reynaldo";
        String mensaje = String.format("Tanto %s como %s desean aprender Java", amigo, hermano);

        System.out.println("Hola Mundo en el Lenguaje Java");
        System.out.println("\nHola amigo" + amigo + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.err.println("\n" + mensaje);
    }
    
}