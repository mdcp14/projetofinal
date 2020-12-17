package br.com.universidadexyz.beans;


/*Design Pattern = compilacao de padroes para projetos (boas praticas
 * Um dos padroes: DTO (Data Transfer Object)
 * 1 - TODOS os atributos devem ser privados.
 * 2 - CADA atributo deve possuir um método de input(set) e um metodo de output
 * 3 - deve possuir no minimo 2 construtores, sendo um vazio e outro cheio(com todos os atributos)
 * Obs.: pacote beans=javabeans=modelo=dto=to
 * */

public class Aluno {

	private int rm;
	private String nome;
	private String cpf;
	
	
	public Aluno() {
		
	}
	
	public Aluno (int rm, String nome, String cpf) {
		this.rm = rm;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public String getAll() {
		return 
				"RM: "   + rm+ "\n" +
		        "Nome: " + nome + "\n"+
				"CPF: "  + cpf + "\n";
	}
	
	
	public void setAll(int rm, String nome, String cpf) {
		this.rm = rm;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	





}

