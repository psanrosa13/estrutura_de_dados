package fila;

import objetos.Aluno;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Aluno aluno = new Aluno();
        fila.insere(aluno);

        Aluno alunoRemovido = (Aluno) fila.remove();

        if (fila.vazia()) {
            System.out.println("A fila está vazia");
        }

        Fila<String> filaDeString = new Fila<String>();
        filaDeString.insere("Adelaide");
        filaDeString.insere("Carolina");

        String carolina = filaDeString.remove();
        String adelaide = filaDeString.remove();

        System.out.println(carolina);
        System.out.println(adelaide);
    }
}
