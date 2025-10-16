package domain;

public class Empreendedor extends Usuario{
	
	public Empreendedor(String nome, int[] dataNascimento, String cpf, String rg, String email, String sexo, String genero, 
	String telefone, Endereco endereco, String senha, String login) {
		super(nome, dataNascimento, cpf, rg, email, sexo, genero, telefone, endereco, senha, login);
	}
}