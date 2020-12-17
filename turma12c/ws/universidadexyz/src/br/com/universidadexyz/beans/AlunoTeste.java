package br.com.universidadexyz.beans;

public class AlunoTeste {
	//primeiro codigo sem usar o getter and seter no menu source 
	private int rm;
	private String nome;
	private String cpf;
	
	public String retornarCPF() {
		return cpf;
	}
	
	public void preencherCpf (String pCpf) {
		cpf= pCpf;
	}
	
	public void preencherNome(String pNome) {
		nome = pNome.toUpperCase();
	}
	
	public String retornarNome() {
		return nome;
	
	}
	
	public void preencherRm(int pRm) {
		rm=pRm;
	}

	public int retornarRm() {
		return rm;
	}


	
	
}
