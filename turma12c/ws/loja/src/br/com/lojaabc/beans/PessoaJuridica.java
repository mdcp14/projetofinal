package br.com.lojaabc.beans;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String contato;
	
	public String getChamado() {
		return
				"Nome: " + super.getNome() + "\n"+
				"Email: " + super.getEmail() + "\n" +
				"Contato: " + contato;
	}
	
	
	//construtor com atributo preenchido (select all)
	public PessoaJuridica(int id, String nome, String email, boolean especial, String cnpj, String contato) {
		super(id, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}
	//construtor pessoa juridica sem atributo (deselect all)
	public PessoaJuridica() {
		super();
	}
	
	//toString
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + super.toString();
	}
	
	//metodo setAll
	public void setAll(int id, String nome, String email, boolean especial, String cnpj, String contato) {
		super.setAll(id, nome, email, especial);
		this.cnpj = cnpj;
		this.contato = contato;
	}
	
	
	
	//getter and setter
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
