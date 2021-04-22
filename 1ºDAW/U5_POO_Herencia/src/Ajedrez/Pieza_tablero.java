package Ajedrez;

public abstract class Pieza_tablero {
    protected int posicionX;
    protected int posicionY;
    protected Color color;

    public Pieza_tablero(int posicionX, int posicionY, Color color) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
