package examengonza;

public abstract class Ganado extends Animal{
    protected String identificador;
    protected Calidad calidad;
    protected boolean vivo;

    public Ganado(int peso, String identificador, Calidad calidad) {
        super(peso);
        this.identificador = identificador;
        this.calidad = calidad;
        this.vivo = true;
    }



    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Calidad getCalidad() {
        return calidad;
    }

    public void setCalidad(Calidad calidad) {
        this.calidad = calidad;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Ganado{" +
                "peso=" + peso +
                ", identificador='" + identificador + '\'' +
                ", calidad=" + calidad +
                ", vivo=" + vivo +
                '}';
    }
}
