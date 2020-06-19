package equalsEhashCode;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {

    private String nome;

    private LocalDate nascimento;

    private String cpf;

    private String localNascimento;

    public Pessoa(String nome, LocalDate nascimento, String cpf, String localNascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.localNascimento = localNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return getNome().equals(pessoa.getNome()) &&
                getNascimento().equals(pessoa.getNascimento()) &&
                getCpf().equals(pessoa.getCpf()) &&
                getLocalNascimento().equals(pessoa.getLocalNascimento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNascimento(), getCpf(), getLocalNascimento());
    }
}
