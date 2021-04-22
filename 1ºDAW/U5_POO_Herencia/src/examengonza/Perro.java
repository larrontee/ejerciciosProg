package examengonza;

public class Perro extends Compañia{
    public Perro(int peso, int avisodeataques) {
        super(peso, avisodeataques);
    }


    @Override
    public void avisarganadero(Ganadero ganadero) {
        System.out.println("Guau! Guau!");
    }
}
