package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {

    private LinkedList<T> objetos = new LinkedList<T>();

    // coloca uma peça no topo da Pilha
    public void insere(T objeto) {
        this.objetos.add(objeto);
    }

    // retira a peça que está no topo da Pilha
    public T remove() {
        return this.objetos.remove(this.objetos.size() - 1);
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }
}
