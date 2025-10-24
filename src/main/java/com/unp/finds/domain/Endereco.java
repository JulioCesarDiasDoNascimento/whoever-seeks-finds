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

    /**
     * O nome da rua, avenida, alameda ou via pública.
     */
    private String logradouro;

    /**
     * O número do imóvel no logradouro.
     * Pode ser uma String para acomodar casos como "SN" (Sem Número) ou blocos.
     */
    private String numero;

    /**
     * Informações adicionais que complementam o endereço (ex: "Apto 301", "Sala 10", "Fundos").
     * Este campo é opcional.
     */
    private String complemento;

    /**
     * O nome do bairro onde o endereço está localizado.
     */
    private String bairro;

    /**
     * O nome da cidade.
     */
    private String cidade;

    /**
     * A sigla da Unidade Federativa (Estado) no formato de duas letras (ex: "RN", "SP").
     */
    private String uf;

    /**
     * O Código de Endereçamento Postal (CEP) no formato de 8 dígitos (ex: "59000000").
     */
    private String cep;
}