package fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<T> {

    private List<T> lista = new LinkedList<T>();

    // insere um novo elemento ao final
    public void insere(T elemento) {
        this.lista.add(elemento);
    }

    // remove o primeiro elemento
    public T remove() {
        return this.lista.remove(0);
    }

    public boolean vazia() {
        return this.lista.size() == 0;
    }
}
