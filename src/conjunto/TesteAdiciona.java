package conjunto;

import java.util.List;

public class TesteAdiciona {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
