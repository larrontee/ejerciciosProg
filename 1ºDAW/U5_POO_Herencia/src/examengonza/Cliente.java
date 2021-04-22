package examengonza;

public class Cliente extends Persona{
    protected String idcliente;

    public Cliente(String nombre, String dni, int edad, String idcliente) {
        super(nombre, dni, edad);
        this.idcliente = idcliente;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idcliente='" + idcliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }
}
