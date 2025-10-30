package com.unp.finds.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * Representa o endereço físico completo de um Negócio ou de qualquer
 * entidade que exija um local de referência.
 */
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
}