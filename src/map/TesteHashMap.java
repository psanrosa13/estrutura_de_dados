package map;

import mapa.Carro;

import java.util.HashMap;

public class TesteHashMap {
    public static void main(String[] args) {

        HashMap<String, Carro> mapa = new HashMap<String, Carro>();
        mapa.put("abc1234", new Carro("a"));
        System.out.println(mapa);
        mapa.put("abc1234", new Carro("b"));
        System.out.println(mapa);
        mapa.put("def1234", new Carro("c"));
        System.out.println(mapa);
        System.out.println(mapa.containsKey("abc1234"));
        System.out.println(mapa.get("abc1234"));
        mapa.remove("abc1234");
        System.out.println(mapa);
    }
}
