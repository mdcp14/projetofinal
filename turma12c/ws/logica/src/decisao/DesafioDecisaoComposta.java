package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		
		
		String produto = JOptionPane.showInputDialog("Nome do Produto").toUpperCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Quantidade: "));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto: "));
		
		
		//Vamos fazer um if para condição
		//&& = and = e
		//|| = or = ou 
		//!= = not = não é igual 
		
		if (qtde>=10 && qtde<=20) {
		    System.out.println(produto + "Estoque Normal");    		
	    }else if (qtde<10) {
		
			System.out.println(produto + "Estoque Baixo");
			
		}else if (qtde>20) {
			
			System.out.println(produto + "Estoque Alto");
			
		} if (valor>1000) {
			
			System.out.println(valor + "Valor alto!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
