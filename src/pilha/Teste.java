package pilha;

import objetos.Aluno;

public class Teste {
    public static void main(String[] args) {
        Pilha<Aluno> pilha = new Pilha<Aluno>();

        Aluno aluno = new Aluno();

        pilha.insere(aluno);

        Aluno alunoRemove = pilha.remove();

        if (pilha.vazia()) {
            System.out.println("A pilha está vazia");
        }

        Pilha<String> pilha2 = new Pilha<String>();

        pilha2.insere("Adalberto");
        pilha2.insere("Maria");

        String maria = pilha2.remove();
        String adalberto = pilha2.remove();

        System.out.println(maria);
        System.out.println(adalberto);
    }
}
