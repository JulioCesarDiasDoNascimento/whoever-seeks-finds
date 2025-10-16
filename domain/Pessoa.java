package domain;

import java.time.LocalDate;

//Criação da classe Pessoa
public class Pessoa{
	private String nome;
	private String cpf; //CPF é válidado antes de ser setado
	private String rg;
	private String cnh;
	private int[] dataNascimento; //Data de nascimento é válidada antes de ser setada
	private String email;
	private String sexo;
	private String genero;
	private String telefone;
	private Endereco endereco;
	
	//Contrutor da classe
	public Pessoa(String nome, int[] dataNascimento, String cpf, String rg, String email, String sexo, String genero, String telefone, 
	Endereco endereco) {
		this.nome = nome;
		setDataNascimento(dataNascimento); //Método setter utilizado para garantil utilização do método de validação
		setCpf(cpf); //Método setter utilizado para garantir utilização do método de validação
		this.rg = rg; 
		this.email = email;
		this.sexo = sexo;
		this.genero = genero;
		this.telefone = telefone;
		this.endereco = endereco;	
	}
	
	//Métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int[] getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int[] dataNascimento) {
		if(validarDataNascimento(dataNascimento) == true) { //Verificação a data de nascimento é válida
			this.dataNascimento = dataNascimento;
		} else {
			System.out.println("Data de nascimento inválida!");
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(validarCpf(cpf) == true) { //Verificação se o CPF é válido
			this.cpf = cpf;
		} else {
			System.out.println("CPF inválido!");
		}
	}
	public void setSalario() {
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//Método para validação do CPF
	public boolean validarCpf(String cpf) {	
		int X = 34;
		String Numero = cpf + X;
		int NumTesteBase = 0, Validador1 = 10, Validador2 = 11, ValorFinal1 = 0, ValorFinal2 = 0, Resto1 = 0, Resto2 = 0;
		for (int i = 1; i < 11; i++) { //Teste do caso base: um CPF com todos os digitos iguais é imediatamente inválido 
			if (Numero.charAt(0) != Numero.charAt(i) - 48) {
				NumTesteBase ++;
			}
		}
		if (NumTesteBase == 0) {
			return false;
		}	
		else { //Teste do primeiro dígito validador 
			for (int j = 0; j < 9; j++) {
				ValorFinal1 = ValorFinal1 + ((Numero.charAt(j) - 48) * Validador1); //Somatório de cada dígito anterior ao validador multiplicado pelo fator correspondente
				Validador1 --;
			}
			if ((ValorFinal1 * 10) % 11 < 10) {
				Resto1 = (ValorFinal1 * 10) % 11;
			} else if ((ValorFinal1 * 10) % 11 == 10) { //Em caso de resto = 10, o dígito deve ser considerado como 0
				Resto1 = 0;
			}
			if (Resto1 == Numero.charAt(9) - 48) {
				for (int k = 0; k < 10; k++) { //Teste do segundo dígito validador
					ValorFinal2 = ValorFinal2 + ((Numero.charAt(k) - 48) * Validador2); //Somatório de cada dígito anterior ao validador multiplicado pelo fator correspondente
					Validador2 --;
				}
				if ((ValorFinal2 * 10) % 11 < 10) {
					Resto2 = (ValorFinal2 * 10) % 11;
				} else if ((ValorFinal1 * 10) % 11 == 10) { //Em caso de resto = 10, o dígito deve ser considerado como 0
					Resto2 = 0;
				}
				if (Resto2 == Numero.charAt(10) - 48) {
					
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
	}
	
	//Método para validar a data de nascimento
	public boolean validarDataNascimento(int[] dataNascimento) {
		LocalDate hoje = LocalDate.now();
		int ano, mes, dia;
		ano = hoje.getYear();
		mes = hoje.getMonthValue();
		dia = hoje.getDayOfMonth();		
		//Verificação que a data de nascimento não é maior que a data atual 
		if (ano < dataNascimento[2]) { 
			return false;
		}
		else if (ano == dataNascimento[2] && mes < dataNascimento[1]) {
			return false;
		}
		else if (ano == dataNascimento[2] && mes == dataNascimento[1] && dia < dataNascimento[0]) {
			return false;
		}
		else { 
			return true;
		}
	}
	
	// Método para cálculo da idade baseada na data de nascimento
	public int calculoIdade(int[] dataNascimento) {
		LocalDate hoje = LocalDate.now();
		int ano;
		ano = hoje.getYear();
		return ano - dataNascimento[2];
	}
}
