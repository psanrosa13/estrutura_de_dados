package vetor;

import objetos.Aluno;

public class TesteAdicionaNoFim {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Paula");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Augusto");

        Vetor lista = new Vetor();
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);

        System.out.println(lista);
    }

}
