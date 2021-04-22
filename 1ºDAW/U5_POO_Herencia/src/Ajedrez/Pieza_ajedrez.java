package Ajedrez;

public abstract class Pieza_ajedrez extends Pieza_tablero implements Movible{
    protected boolean movil;

    public Pieza_ajedrez(int posicionX, int posicionY, Color color, boolean movil) {
        super(posicionX, posicionY, color);
        this.movil = movil;
    }

    public boolean isMovil() {
        return movil;
    }

    public void setMovil(boolean movil) {
        this.movil = movil;
    }


    @Override
    public String toString() {
        return "Pieza_ajedrez{" +
                "movil=" + movil +
                '}';
    }
}
