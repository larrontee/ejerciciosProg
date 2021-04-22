package ejCubo;

import org.w3c.dom.ls.LSOutput;

/*
Vamos a crear la clase Cubo. Para saber qué atributos se deben definir, nos preguntamos
qué características tienen los cubos - igual que hicimos con la clase GatoSimple. Todos los
cubos tienen una determinada capacidad, un color, están hechos de un determinado
material - plástico, latón, etc. - y puede que tengan asa o puede que no. Un cubo
se fabrica con el propósito de contener líquido; por tanto otra característica es la
cantidad de litros de líquido que contiene en un momento determinado. Por ahora,
solo nos interesa saber la capacidad máxima y los litros que contiene el cubo en cada
momento, así que esos serán los atributos que tendremos en cuenta.

Enviar mensaje a #general
 */
public class Cubo {
    public static void main(String[] args) {
        Cubo cubata=new Cubo("rojo", true,100,Material.PLASTICO );
        Cubo cubeta=new Cubo(false, 20, Material.METAL);

        cubata.llenarcubo(cubata.getCapacidad_max());
        cubata.volcarcuboen(cubeta);

        System.out.println("cuabata"+cubata);
        System.out.println("tuteta"+cubeta);
    }
    private String color;
    private boolean asa;
    private int capacidad_max, litros_usados;
    private Material material;

    public Cubo(String color, boolean asa, int capacidad_max, Material material) {
        this.color = color;
        this.asa = asa;
        this.capacidad_max = capacidad_max;
        this.litros_usados = 0;
        this.material = material;
    }

    public Cubo(boolean asa, int capacidad_max, Material material) {
        this("azul", asa, capacidad_max,material);
        this.litros_usados = 2;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getLitros_usados() {
        return litros_usados;
    }

    public void setLitros_usados(int litros_usados) {
        this.litros_usados = litros_usados;
    }

    public int llenarcubo(int cant_liquido){
        if (cant_liquido+litros_usados<capacidad_max){
                litros_usados+=cant_liquido;
            }   else{
                litros_usados=capacidad_max;
            }
            return litros_usados;
        }

    public int vaciarcubo(int cant_liquido){
        if (cant_liquido>litros_usados){
            litros_usados=0;
        } else{
            litros_usados-=cant_liquido;
        }

        return litros_usados;
    }


    public int volcarcuboen(Cubo cubo2){
        cubo2.llenarcubo(litros_usados);
        vaciarcubo(litros_usados);
        return cubo2.getLitros_usados();
    }

/*

    public int echarsinvolcar(Cubo cubo2){
        cubo2.llenarcubo(cubo2.getCapacidad_max());
    }

*/
    @Override

        public String toString() {
            return "Cubo{" +
                    "color='" + color + "\n" +
                    ", asa=" + asa +    "\n"+
                    ", capacidad_max=" + capacidad_max +"\n"+
                    ", litros_usados=" + litros_usados +"\n"+
                    ", material=" + material +"\n"+
                    '}'+"\n";
        }
    }