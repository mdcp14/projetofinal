package br.com.universidadexyz.beans;

public class Professor {
	
	private int id;
	private String apelido;
	private String formacao;
	private float valorHora;
	
	
	public Professor(int i, String string, String string2, int j, Endereco endereco) {
		
	}
	
	public Professor(int id, String apelido, String formacao, float valorHora) {
		this.id = id;
		this.apelido = apelido;
		this.formacao = formacao;
		this.valorHora = valorHora;
	}
	
	public Professor() {
		
	}

	public void setAll(int id, String apelido, String formacao, float valorHora) {
		this.id = id;
		this.apelido = apelido;
		this.formacao = formacao;
		this.valorHora = valorHora;
	}
	
	
	public String getAll() {
		return 
				"ID: "   + id + "\n" +
		        "Apelido: " + apelido + "\n"+
				"Formacao: "  + formacao + "\n" +
				"Valor Hora: "  + valorHora;	
	}
	
	
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getForma��o() {
		return formacao;
	}
	public void setForma��o(String formacao) {
		this.formacao = formacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public void setEndereco(Endereco e) {
		
	}
	
	public String getEndereco(String endereco) {
		return endereco; 
	}
	



}
