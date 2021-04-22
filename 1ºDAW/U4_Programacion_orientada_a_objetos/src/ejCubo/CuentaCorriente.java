package ejCubo;

import java.util.Scanner;
//Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco. Añadir un atributo que almacene el nombre del banco (que es único) en la
// clase CuentaCorriente. Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas corrientes)
public class CuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente c1=new CuentaCorriente("pepe","55555555m",0);
        setBanco("gonzalobanck");
        c1.ingresar_dinero(99999999);
        System.out.println(c1);

        c1.sacat_dinero(99999999);
        System.out.println(c1);
    }
    private int limite;
    private String Nombre;
    private String Dni;
    private int saldo;
    private static String banco="";



    public CuentaCorriente(String nombre, String dni, int saldo) {
        this.limite = -50;
        Nombre = nombre;
        Dni = dni;
        this.saldo = saldo;
    }

    public CuentaCorriente(String nombre, String dni) {
        this(nombre,dni,0);
    }

    public CuentaCorriente( int saldo) {
        this.limite = 0;
        Nombre= "";
        Dni= "";
        this.saldo = saldo;
    }

    public int getLimite_descubrimiento() {
        return limite;
    }

    public void setLimite_descubrimiento(int limite_descubrimiento) {
        this.limite = limite_descubrimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public static void setBanco(String nbanco) {
        banco=nbanco;
    }







    public boolean sacat_dinero(int valor){
        if (valor>0) {
            if (saldo - valor >= limite) {
                saldo = saldo - valor;
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    public void ingresar_dinero(int valor){
        if (valor>0) {
            saldo += valor;
        } else{
            saldo=saldo;
        }

    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "limite=" + limite +
                ", Nombre='" + Nombre + '\'' +
                ", Dni='" + Dni + '\'' +
                ", saldo=" + saldo +
                ", banco='" + banco + '\'' +
                '}';
    }
}
