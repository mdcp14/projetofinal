package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String cargo = "";
		char resposta=0;
		float salario =0;
		
		
		do {
			cargo = JOptionPane.showInputDialog("Cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
			JOptionPane.showMessageDialog(null,  "Valor hora: " + (salario/160));
			
		}while (JOptionPane.showConfirmDialog(
				null,
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION)==0);
			
		
		
	}

}
