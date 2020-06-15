package listaLigada;

public class TesteRemoveDoFim {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.removeDoFim();

        System.out.println(lista);
    }
}
