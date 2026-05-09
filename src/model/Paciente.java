package model;

import java.util.Objects;

public class Paciente {

    private String nome;
    private String cpf;
    private int idade;
    private String especialidade;

    public Paciente(String nome, String cpf, int idade, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public int getIdade() { return idade; }
    public String getEspecialidade() { return especialidade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    // equals e hashCode pelo CPF — dois objetos com o mesmo CPF são o mesmo paciente
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(cpf, paciente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return nome + " | CPF: " + cpf + " | Idade: " + idade + " | " + especialidade;
    }
}
