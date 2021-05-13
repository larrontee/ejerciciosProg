package ejemplo_inicial;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola mundo!!!");

        //Realizo la serialización
        BagOfPrimitives bop = new BagOfPrimitives();
        Gson gson = new Gson();

        String json = gson.toJson(bop);

        System.out.println(json);
    }
}
