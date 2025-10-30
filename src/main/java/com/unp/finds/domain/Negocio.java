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

    private String nome;
    private String tipo;
    private Endereco endereco;
    private String horarioFuncionamento;
    private String telefone;
    private String email;
    private String descricao;
    private boolean acessibilidade;
    // TODO: O TIPO DA FOTO VAI SER AVALIDO SE VAI MANTER DESSA FORMA!!!
    //private String[] linkFoto; //Links das fotos do negócio
    //private String[] linkSocial; //Links das redes sociais do negócio


}




