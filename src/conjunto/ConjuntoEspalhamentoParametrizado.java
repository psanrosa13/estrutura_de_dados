package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoParametrizado<T> {
    private List<List<T>> tabela = new ArrayList<List<T>>();

    private int tamanho = 0;

    public void ConjuntoEspalhamento() {
        for (int i = 0; i < 26; i++) {
            LinkedList<T> lista = new LinkedList<T>();
            tabela.add(lista);
        }
    }

    public void adiciona(T tipo) {
        if (!this.contem(tipo)) {
            verificaCarga();
            int indice = this.calculaIndiceDaTabela(tipo);
            List<T> lista = this.tabela.get(indice);
            lista.add(tipo);
            tamanho++;
        }
    }

    public void remove(T tipo) {
        if (this.contem(tipo)) {
            int indice = this.calculaIndiceDaTabela(tipo);
            List<T> lista = this.tabela.get(indice);
            lista.remove(tipo);
            tamanho--;
            verificaCarga();
        }
    }

    public boolean contem(T tipo) {
        int indice = this.calculaIndiceDaTabela(tipo);
        List<T> lista = this.tabela.get(indice);
        return lista.contains(tipo);
    }

    public List<T> pegaTodas(){
        List<T> lista = new ArrayList<T>();
        for (int i = 0; i < this.tabela.size(); i++) {
            lista.addAll(this.tabela.get(i));
        }
        return lista;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private int calculaIndiceDaTabela(T tipo){
        int codigoDeEspalhamento = tipo.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }


    private void redimensionaTabela(int novaCapacidade){
        List<T> lista = this.pegaTodas();
        this.tabela.clear();
        for (int i = 0; i < novaCapacidade; i++) {
            this.tabela.add(new LinkedList<T>());
        }
        for (T tipo : lista) {
            this.adiciona(tipo);
        }
    }

    private void verificaCarga() {
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;
        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
}
