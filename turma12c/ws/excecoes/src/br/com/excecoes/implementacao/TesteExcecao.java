package br.com.excecoes.implementacao;

import tratarexcecao.MinhaExcecao;

public class TesteExcecao {

	/*Existe 2 tipos de excecoes;
	 * Unchecked�s = DC (depois da complica��o);
	 * Checked�s = AC (antes da compila��o)
	 * */
	
	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt("89");
			if (numero<0) {
				throw new RuntimeException("Ligue para a central");
			}
			System.out.println("N�mero: " + numero);
			
			String palavra = "";
			System.out.println("Qtde de caracteres: " + palavra.length());
			
			int [] valores = new int [3];
			valores[0] = 541; //pode ser qq valor
			valores [1] = 89;
			valores [2] = 10;
					
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e)); 
			
		}finally {
			System.out.println("tenha um bom dia");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
