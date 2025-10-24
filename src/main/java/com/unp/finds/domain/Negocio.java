package com.unp.finds.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Representa uma entidade de negócio ou estabelecimento.
 * Contém todas as informações de contato, localização e descrição do local.
 */
@Getter
@Setter
public class Negocio {

    /**
     * O nome completo ou fantasia do negócio, usado para identificação.
     */
    private String nome;

    /**
     * O tipo ou categoria do negócio (ex: "Restaurante", "Loja de Roupas", "Bar").
     * Utilizado para filtros e categorização.
     */
    private String tipo;

    /**
     * Objeto que contém o endereço físico completo do negócio (Rua, Número, Cidade, CEP, etc.).
     */
    private Endereco endereco;

    /**
     * Horário de funcionamento do negócio (ex: "Seg a Sex das 9h às 18h").
     */
    private String horarioFuncionamento;

    /**
     * Número de telefone para contato primário do negócio.
     */
    private String telefone;

    /**
     * Endereço de e-mail para contato do negócio ou para correspondência.
     */
    private String email;

    /**
     * Descrição detalhada do negócio, incluindo serviços, produtos oferecidos e histórico.
     */
    private String descricao;

    /**
     * Indica se o local possui acessibilidade física para pessoas com mobilidade reduzida.
     * Retorna {@code true} se for acessível, {@code false} caso contrário.
     */
    private boolean acessibilidade;

    // TODO: O TIPO DA FOTO VAI SER AVALIDO SE VAI MANTER DESSA FORMA!!!
    //private String[] linkFoto; //Links das fotos do negócio
    //private String[] linkSocial; //Links das redes sociais do negócio


}




