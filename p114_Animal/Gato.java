package p114_Animal;

public class Gato implements Animal{

    @Override
    public void dormir() {
        System.out.println("El gato duerme en una caja");
        
    }

    @Override
    public void sonido() {
        System.out.println("El gato hace miauuuuuuuuu");
        
    }
}
