package conjunto;

import java.util.List;

public class TesteRemove {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");

        List<String> palavras = conjunto.pegaTodas();

        System.out.println("antes de remover");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        conjunto.remove("Rafael");
        
        palavras = conjunto.pegaTodas();

        System.out.println("depois de remover");

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
