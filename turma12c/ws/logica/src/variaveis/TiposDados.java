package variaveis;

import javax.swing.JOptionPane;
  //swing = pacote que contém recurso para telas
public class TiposDados {

	public static void main(String[] args) {
		
		/*tipos de dados: numerico e alfanumerico;
		 * Numérico: é o tipo de dados que PODE ser utilizado em expressão aritmética ou quando for um
		 * um dado sensível para busca;
		 * CEP (no contexto Correios) => 00010009
		 * CPF (contexto da Receita Federal)
		 * Número de matrícula (no contexto de faculdade devido a importância)
		 * Em Javanês: 
		 *  int => se for número inteiro (qty de alunos na sala;
		 *  double => se for números reais (casa decimais 00,09) 
	
		 * Alfanumérico:é o tipo de dado que não será utilizado em cálculos.
		 * CEP (no contexto DP do Itau) = 00010-009
		 * CPF (no contexto faculdade) 
		 * Em Javanes = String 
		 */
		
		//Criar uma váriavel: <tipo de dado> <nome da varáivel> = <valor>
		//somente String vai com ""
		//Classes Wrappers: são as classes que apoiam os tipos primitivos:
		//Exemplo:
		//Integer = int
		//Double = double
		//Float = float
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		//ctrl shift O = necessário para importar a classe
		//Integer.parseInt
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		double imc = peso / (altura * altura);
		
		//ln muda de linha e vem na frente do print
		
 		System.out.println("Nome: "   + nome);
 		System.out.println("Altura: " + altura);
 		System.out.println("Peso: "   + peso);
 		System.out.println("Idade: "  + idade);
		System.out.println("IMC: "    + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
