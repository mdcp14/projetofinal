package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		
		curso.setAll(
				JOptionPane.showInputDialog("Descri��o"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				Short.parseShort(JOptionPane.showInputDialog("Carga Horaria")),
				JOptionPane.showInputDialog("Sigla")
				);
			
		
			System.out.println("Valor Promocao (10%) " + curso.getPromocao());
			System.out.println(curso.getAll());
			System.out.println("Valor Promocao: " +  curso.getPromocao(20));
			System.out.println(curso.getValor());
			curso.ajustarValor(20);
			
			System.out.println(curso.getAll());
			
		}
			

	}


