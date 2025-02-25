package br.com.lojaabc.beans;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String rg;
	private String nascimento;
	
	//construtor com atributo preenchido (select all)
	public void setAll(String cpf, String rg, String nascimento) {
		
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	
	//construtor pessoa juridica sem atributo (deselect all)
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String cpf, String rg, String nascimento) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}




	//toString
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", nascimento=" + nascimento + "]";
	}
	
	
	//getter and setter
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
	
}
