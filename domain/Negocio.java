package domain;

//Criação da classe Negocio
public class Negocio {
	private String nomeNegocio; //Nome do negócio
	private String tipo; //Tipo de negócio
	private Endereco enderecoNegocio; //Endereço do negócio
	private String horarioFuncionamento; //Horário de funcionamento do negócio
	private String telefoneNegocio; //Número de telefone para contato do negócio
	private String emailNegocio; //Endereço de e-mail para contato do negócio
	private String descricao; //Descrição do negócio
	private boolean acessibilidade; //Indicação se o local possui acessibilidade para pessoas com mobilidade reduzida
	private String[] linkFoto; //Links das fotos do negócio
	private String[] linkSocial; //Links das redes sociais do negócio
	
	//Construtor da classe
	public Negocio(String nomeNegocio, String tipo, Endereco enderecoNegocio, String horarioFuncionamento, String telefoneNegocio, 
		String emailNegocio, String descricao, boolean acessibilidade, String[] linkFoto) {
		this.nomeNegocio = nomeNegocio;
		this.tipo = tipo;
		this.enderecoNegocio = enderecoNegocio;
		this.horarioFuncionamento = horarioFuncionamento;
		this.telefoneNegocio = telefoneNegocio;
		this.emailNegocio = emailNegocio;
		this.descricao = descricao;
		this.acessibilidade = acessibilidade;
		this.linkFoto = linkFoto;
	}
	
	//Métodos getters e setters
	public String getNomeNegocio() {
		return nomeNegocio;
	}
	public void setNomeNegocio(String nomeNegocio) {
		this.nomeNegocio = nomeNegocio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Endereco getEnderecoNegocio() {
		return enderecoNegocio;
	}
	public void setEnderecoNegocio(Endereco enderecoNegocio) {
		this.enderecoNegocio = enderecoNegocio;
	}
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public String getTelefoneNegocio() {
		return telefoneNegocio;
	}
	public void setTelefoneNegocio(String telefoneNegocio) {
		this.telefoneNegocio = telefoneNegocio;
	}
	public String getEmailNegocio() {
		return emailNegocio;
	}
	public void setEmailNegocio(String emailNegocio) {
		this.emailNegocio = emailNegocio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean getAcessibilidade() {
		return acessibilidade;
	}
	public void setAcessibilidade(boolean acessibilidade) {
		this.acessibilidade = acessibilidade;
	}
	public String[] getLinkFoto() {
		return linkFoto;
	}
	public void setLinkFoto(String[] linkFoto) {
		this.linkFoto = linkFoto;
	}
	public String[] getLinkSocial() {
		return linkSocial;
	}
	public void setLinkSocial(String[] linkSocial) {
		this.linkSocial = linkSocial;
	}
}




