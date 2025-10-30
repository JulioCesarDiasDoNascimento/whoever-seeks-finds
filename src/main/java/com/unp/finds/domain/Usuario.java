package com.unp.finds.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * Representa um usuário do sistema, estendendo a entidade {@link Pessoa}
 * e adicionando credenciais de acesso para autenticação.
 */
public class Usuario extends Pessoa {

    private String senha;
    private String login;

}