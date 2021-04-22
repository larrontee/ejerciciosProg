package examengonza;

public abstract class Compañia extends Animal implements Avisar{
    protected int avisodeataques;

    public Compañia(int peso, int avisodeataques) {
        super(peso);
        this.avisodeataques = avisodeataques;
    }

    public int getAvisodeataques() {
        return avisodeataques;
    }

    public void setAvisodeataques(int avisodeataques) {
        this.avisodeataques = avisodeataques;
    }




    @Override
    public String toString() {
        return "Compañia{" +
                "peso=" + peso +
                ", avisodeataques=" + avisodeataques +
                '}';
    }
}
