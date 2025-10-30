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

    private String nome;
    private String cpf;
    private String rg;
    private String cnh;
    private Date dataNascimento;
    private String email;
    private String sexo;
    private String genero;
    private String telefone;
    private Endereco endereco;
}