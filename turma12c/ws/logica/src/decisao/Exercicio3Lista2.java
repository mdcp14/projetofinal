package decisao;

import javax.swing.JOptionPane;

public class Exercicio3Lista2 {

	public static void main(String[] args) {
		
		
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
	String operacao = JOptionPane.showInputDialog("Qual a operação aritmetica");
	int resultado = 0;
	String message = "";
	
	if(operacao.equals("+")) {
		resultado = num1 + num2;
	}
	else if(operacao.equals("-")) {
		resultado = num1 - num2;
	}
	else if(operacao.equals("*")){
		resultado = num1 * num2;
	}
	else if(operacao.equals("/")) {
		resultado = num1 / num2;
	}
	else {
		message = "Operador \"" + operacao + "\" não é válido";
	}
	
	if (message == "") {
		message = "Resultado: " + resultado;
	}
	System.out.println(message);
	JOptionPane.showInputDialog(null, message);
	
		
		
		
	
		
		
		
		
		
		
		

	}

}
