package decisao;

import javax.swing.JOptionPane;

public class Exercicio4Lista2 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3: "));
		
		if (valor1!=valor2 && valor1!=valor3 && valor3!=valor2) {
			if (valor1>valor2 && valor1>valor3) {
				System.out.println(valor1);
				
				if (valor2>valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);
				}
		
	
			}
		}
	}
}	

	

		
	
