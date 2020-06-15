package conjunto;

import java.util.List;

public class TesteAdiciona {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<Object> palavras = conjunto.pegaTodas();

        for (Object palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
