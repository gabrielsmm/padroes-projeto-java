package com.gabrielsmm.gof.criacionais.builder.meal;

import com.gabrielsmm.gof.criacionais.builder.meal.builder.PessoaFisicaBuilder;
import com.gabrielsmm.gof.criacionais.builder.meal.model.PessoaFisica;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisicaBuilder("Gabriel")
                .endereco("Rua sem nome")
                .telefone("6299996666")
                .email("gabriel@teste.com")
                .build();
        System.out.println(pessoaFisica);

        PessoaFisica pessoaFisica2 = new PessoaFisicaBuilder("Jorge")
                .dataNascimento(new Date())
                .cpf("93010293844")
                .rg("8330295")
                .endereco("Rua com nome")
                .telefone("7692394921")
                .email("jorge@teste.com")
                .build();
        System.out.println(pessoaFisica2);
    }

}
