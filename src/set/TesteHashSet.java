package set;

import java.util.HashSet;

public class TesteHashSet {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add("Rafael");
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");

        System.out.println(conjunto);
    }
}
