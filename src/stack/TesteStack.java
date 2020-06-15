package stack;

import objetos.Aluno;

import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        Aluno aluno = new Aluno();
        aluno.setNome("Paula");

        System.out.println(aluno);

        pilha.push(aluno);

        Aluno alunoRemove = (Aluno) pilha.pop();
        System.out.println(alunoRemove.getNome());
        System.out.println(alunoRemove);

        if(pilha.isEmpty()){
            System.out.println("A pilha está vazia");
        }
    }
}
