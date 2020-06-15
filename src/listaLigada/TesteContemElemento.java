package listaLigada;

public class TesteContemElemento {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        System.out.println(lista.contem("Rafael"));
        System.out.println(lista.contem("Camila"));
    }
}
