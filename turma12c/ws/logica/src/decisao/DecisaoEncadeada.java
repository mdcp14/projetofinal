package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		if (faltas<20) {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2"));
			float media = (nota1+nota2)/2;

			//Vamos fazer um if para condi��o
			//&& = and = e
			//|| = or = ou 
			//!= = not = n�o � igual 

			if (media>=6) {
				System.out.println(nome + "Parab�ns voc� foi aprovado");  

			}else if (media<4) {
				System.out.println(nome + "Infelizmente voc� foi reprovado");

			}else if (media<6 && media>=4) {
				System.out.println(nome + "Voc� ainda tem chance");	
			}

			System.out.println("Sua m�dia foi: " + media);
		}else {
			System.out.println("Reprovado por faltas");
		}
	}
}
