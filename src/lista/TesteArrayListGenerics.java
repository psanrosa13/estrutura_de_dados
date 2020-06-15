package lista;

import objetos.Aluno;

import java.util.ArrayList;

public class TesteArrayListGenerics {
    public static void main(String[] args) {
        ArrayList vetorSemGenerics = new ArrayList();

        ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();

        Aluno aluno = new Aluno();

        vetorSemGenerics.add(aluno);
        vetorComGenerics.add(aluno);

        Aluno a1 = (Aluno) vetorSemGenerics.get(0);
        Aluno a2 = vetorComGenerics.get(0);
    }
}
