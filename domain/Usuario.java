package domain;

//Criação da classe Usuario
public class Usuario extends Pessoa{ //A classe Usuario herda métodos e atributos da classe Pessoa
	private String senha;
	private String login;
	
	//Contrutor da classe
	public Usuario(String nome, int[] dataNascimento, String cpf, String rg, String email, String sexo, String genero, String telefone, 
			Endereco endereco, String senha, String login) {
		super(nome, dataNascimento, cpf, rg, email, sexo, genero, telefone, endereco);
		this.senha = senha;
		this.login = login;
	}
	
	//Métodos getters e setters
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}