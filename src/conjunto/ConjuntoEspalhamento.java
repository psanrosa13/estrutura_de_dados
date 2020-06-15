package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {

    private List<List<Object>> tabela = new ArrayList<List<Object>>();

    private int tamanho = 0;

    public ConjuntoEspalhamento() {
        for (int i = 0; i < 26; i++) {
            LinkedList<Object> lista = new LinkedList<Object>();
            tabela.add(lista);
        }
    }

    public void adiciona(Object object) {
        if (!this.contem(object)) {
            verificaCarga();
            int indice = this.calculaIndiceDaTabela(object);
            List<Object> lista = this.tabela.get(indice);
            lista.add(object);
            tamanho++;
        }
    }

    public void remove(Object object) {
        if (this.contem(object)) {
            int indice = this.calculaIndiceDaTabela(object);
            List<Object> lista = this.tabela.get(indice);
            lista.remove(object);
            tamanho--;
            verificaCarga();
        }
    }

    public boolean contem(Object object) {
        int indice = this.calculaIndiceDaTabela(object);
        List<Object> lista = this.tabela.get(indice);
        return lista.contains(object);
    }

    public List<Object> pegaTodas(){
        List<Object> lista = new ArrayList<Object>();
        for (int i = 0; i < this.tabela.size(); i++) {
            lista.addAll(this.tabela.get(i));
        }
        return lista;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private int calculaIndiceDaTabela(Object object){
        int codigoDeEspalhamento = object.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }


    private void redimensionaTabela(int novaCapacidade){
        List<Object> lista = this.pegaTodas();
        this.tabela.clear();
        for (int i = 0; i < novaCapacidade; i++) {
            this.tabela.add(new LinkedList<Object>());
        }
        for (Object object : lista) {
            this.adiciona(object);
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
