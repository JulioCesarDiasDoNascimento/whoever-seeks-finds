package com.unp.finds.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.time.LocalDate;

@Getter
@Setter
/**
 * Representa uma entidade Pessoa, contendo dados de identificação e contato.
 */
public class Pessoa {

    /**
     * O nome completo da pessoa.
     */
    private String nome;

    /**
     * O Cadastro de Pessoa Física (CPF) da pessoa.
     * Deve ser validado antes de ser persistido.
     */
    private String cpf;

    /**
     * O Registro Geral (RG) ou documento de identidade da pessoa.
     */
    private String rg;

    /**
     * A Carteira Nacional de Habilitação (CNH) da pessoa.
     * Este campo é opcional.
     */
    private String cnh;

    /**
     * A data de nascimento da pessoa. O formato esperado deve ser [dia, mês, ano].
     * A data deve ser validada (ex: se é uma data real) antes de ser persistida.
     */
    private Date dataNascimento;  // int[] dataNascimento;

    /**
     * O endereço de e-mail principal para contato da pessoa.
     */
    private String email;

    /**
     * O sexo biológico da pessoa.
     */
    private String sexo;

    /**
     * O gênero com o qual a pessoa se identifica.
     */
    private String genero;

    /**
     * O número de telefone ou celular para contato da pessoa.
     */
    private String telefone;

    /**
     * Objeto que contém o endereço físico completo de residência da pessoa.
     * O objeto é do tipo {@link Endereco}.
     */
    private Endereco endereco;
}