package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
		double media = (nota1 + nota2)/2;
		

 		System.out.println("Disciplina: "   + disciplina);
 		System.out.println("Nota 1: "       + nota1);
 		System.out.println("Nota 2: "       + nota2);
 		System.out.println("Média: "        + media);
	
		
		/*
		 * Regras para identificadores (nome):
		 * 1 - não começaras com números. Exemplo: 1berto (errado)
		 * 2 - não usar palavras reservadas de linguagem. Exemplo: double, int, class e etc
		 * 3 - não fazer uso de caracteres especial no nome da váriavel. Exemplo: not@ (errado)
		 */
		
		/*Padrões para identificadores:
		 * -CamelCase => cada palavra em um nome deve ser iniciado com letra maiúscula.
		 * Exemplo: PessoaFisica (Classe) - dataDeNascimento (Variavel)
		 * Nome significativos, evite; Exemplo: x, y, z, alpha, n1, n2 e etc
		 * Toda classe deve iniciar com letra Maiuscula;
		 * Toda variavel deve iniciar com letra Minuscula;
		 * Todo metodo pertence a uma classe e deve vir seguindo de parenteses;
		 * xpto = variavel 
		 * Xpto = classe
		 * Xpto.abs() = abc é um método
		 * 		 */
		
		

	}

}
