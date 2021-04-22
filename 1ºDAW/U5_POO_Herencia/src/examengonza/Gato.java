package examengonza;

import org.w3c.dom.ls.LSOutput;

public class Gato extends Compañia{
    public Gato(int peso, int avisodeataques) {
        super(peso, avisodeataques);
    }


    @Override
    public void avisarganadero(Ganadero ganadero) {
        System.out.println("miau");
    }
}
