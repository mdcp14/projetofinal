package variaveis;

import javax.swing.JOptionPane;

public class Produtos {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Produto");
        short qtde = Short.parseShort(JOptionPane.showInputDialog("Qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
         
		
		/*Entre os tipos primitivos inteiros
		 * byte = 128 / +127
		 * short = - 32...mil / +32...mil
		 * int = -2 bilhoes / +2 bilhoes
		 * long = - 9b... / +9 b.....
		 * Cast = convers�o entre dados do mesmo tipo, MAS com tamanhos diferentes
		 */
		
		
	
		
		

	}

}
