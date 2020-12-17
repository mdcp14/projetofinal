package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		
		Professor p = new Professor();
		p.setApelido("1berto");
		p.setId(709);
		p.setFormação("MS");
		p.setValorHora(10);
		
		Endereco e = new Endereco();
		
		p.setEndereco(e);
		
		e.setLogradouro("RUA Lago de Pedra");
		e.setNumero("40");
		e.setBairro("Caps");
		e.setCidade("Guarulhos");
		e.setUf("SP");
		e.setCep("13131-111");
		
		
		System.out.println(p.getApelido());
		System.out.println(p.getFormação());
		
		
		
		

	}

}
