package queue;

import objetos.Aluno;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        Queue<Aluno> fila = new LinkedList<Aluno>();

        Aluno aluno = new Aluno();
        fila.offer(aluno);

        Aluno alunoRemovido = fila.poll();

        if(fila.isEmpty()){
            System.out.println("A fila está vazia");
        }
    }
}
