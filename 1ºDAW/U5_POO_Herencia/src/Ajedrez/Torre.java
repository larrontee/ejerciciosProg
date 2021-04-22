package Ajedrez;

public class Torre extends Pieza_ajedrez{
    public Torre(int posicionX, int posicionY, Color color, boolean movil) {
        super(posicionX, posicionY, color, movil);
    }

    @Override
    public boolean esMovible(int x, int y) {
        if (x==posicionX || y==posicionY){
            return true;
        }
        return false;
    }

    @Override
    public void mover(int x, int y) {
        if (esMovible(x,y)){
            posicionX=x;
            posicionY=y;
        }
    }

}

