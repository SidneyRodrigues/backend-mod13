package br.com.smorais;

import br.com.smorais.subclasses.PessoaFisica;
import br.com.smorais.subclasses.PessoaJuridica;

public class App {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(
                "Luis Dias Rodrigues",
                "Rua Benedito José Theodoro, 1033",
                "717.337.252-61",
                "27/05/1999"
        );
        PessoaJuridica pj = new PessoaJuridica(
                "Alice M. Bell",
                "Quadra Doze, 1309, Ananindeua-PA",
                "51.586.953/0001-14",
                "“Coca Cola Indústrias Ltda"
        );
        System.out.println("Informações da Pessoa Física");
        pf.exibirInfo();

        System.out.println("------------------------------------");

        System.out.println("Informações da Pessoa Física");
        pj.exibirInfo();
    }
}
