package br.com.elevador.testes;

import br.com.elevador.modelo.Elevador;

public class ElevadorTestes {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.definirValores(
				"Torre B", 
				(short) 10,
				(short) -1 ,
				(byte) 5
				);
		System.out.println(elevador.exibirDados());
		elevador.entrar ((byte)3);
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.exibirDados());
		elevador.entrar((byte)20);
		elevador.subir();
		System.out.println(elevador.exibirDados());
		elevador.sair((byte)2);
		System.out.println(elevador.exibirDados());
		
		
		

	}

}
