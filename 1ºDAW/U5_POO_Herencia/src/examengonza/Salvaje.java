package examengonza;

public abstract class Salvaje extends Animal implements Atacar{
    protected int kills;

    public Salvaje(int peso, int kills) {
        super(peso);
        this.kills = kills;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }



    @Override
    public void atack(Ganado presa) {
        if (presa.vivo){
            presa.vivo=false;
        }
    }

    @Override
    public String toString() {
        return "Salvajes{" +
                "peso=" + peso +
                ", kills=" + kills +
                '}';
    }
}
