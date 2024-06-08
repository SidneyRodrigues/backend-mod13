package br.com.smorais.subclasses;

import br.com.smorais.abstratas.Pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String cpf, String dataNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " +getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
