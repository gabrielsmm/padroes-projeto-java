package com.gabrielsmm.gof.criacionais.builder.meal.builder;

import com.gabrielsmm.gof.criacionais.builder.meal.model.PessoaFisica;

import java.util.Date;

public class PessoaFisicaBuilder {

    // Obrigatório
    private String nome;

    // Opcional
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String email;

    public PessoaFisicaBuilder(String nome) {
        this.nome = nome;
    }

    public PessoaFisicaBuilder dataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public PessoaFisicaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaFisicaBuilder rg(String rg) {
        this.rg = rg;
        return this;
    }

    public PessoaFisicaBuilder endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public PessoaFisicaBuilder telefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public PessoaFisicaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaFisica build() {
        return new PessoaFisica(nome, dataNascimento, cpf, rg, endereco, telefone, email);
    }

}
