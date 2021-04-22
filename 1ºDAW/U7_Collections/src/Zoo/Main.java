package Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo z1=new Zoo();
        Foca f1=new Foca("foquita",1000, 10,20);
        Oso o1=new Oso("osito", 12239, true, true);
        z1.addAnimal(f1);
        z1.addAnimal(o1);

        System.out.println(z1);
    }
}
