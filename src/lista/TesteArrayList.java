package lista;

import objetos.Aluno;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList vetor = new ArrayList();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        vetor.add(aluno1);
        vetor.add(aluno2);
        vetor.add(0, aluno3);

        int tamanho = vetor.size();

        if (tamanho != 3) {
            System.out.println("Erro: O tamanho da lista está errado.");
        }
        if (!vetor.contains(aluno1)) {
            System.out.println("Erro: Não achou um aluno que deveria estar na lista");
        }

        vetor.remove(0);

        tamanho = vetor.size();

        if (tamanho != 2) {
            System.out.println("Erro: O tamanho da lista está errado.");
        }
        if (vetor.contains(aluno3)) {
            System.out.println("Erro: Achou um aluno que não deveria estar na lista");
        }
    }

}
