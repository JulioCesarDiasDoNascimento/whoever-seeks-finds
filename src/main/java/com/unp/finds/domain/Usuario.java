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

    /**
     * A senha de acesso do usuário. Recomenda-se que este campo seja
     * armazenado como um hash criptográfico (e não texto puro) no banco de dados.
     */
    private String senha;

    /**
     * O nome de usuário (login) exclusivo utilizado para acesso ao sistema.
     * Pode ser um e-mail ou um nome de usuário alfanumérico.
     */
    private String login;

}