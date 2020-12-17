package br.com.bankofoz.beans;

public class Poupanca extends Conta{

	private float rendimento;
	
	public float verificarSaldo(){
		return super.getSaldo();
	}
	
	
	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo() + rendimento);
		rendimento = 0;
		
	}
	
	
	

	public float getRendimento() {
		return rendimento;
	}



	public Poupanca(int id, String nome, String email, boolean especial, short numero, byte digito, short agencia,
			float saldo, Cliente cliente, float rendimento) {
		super(id, nome, email, especial, numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}



	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + "]";
	}

	public Poupanca(float rendimento) {
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}
	
	public void setAll(float rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	
	
}
