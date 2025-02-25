package br.com.bankofoz.beans;

/*Polimorfismo: � o quarto pilar da OO. Que permite deixarmos m�todos com o mesmo nome, realizando 
 * opera��es distintas.
 * S�o 2 tipos:
 * -Overload (sobrecarga) = os metodos est�o na mesma classe;
 * Override (sobeescrita) = os metodos se encontram em classes diferentes
 * */


public abstract class Conta  {

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	public float verificarSaldo() {
	return 0;	
	
	}
	
	public boolean sacar (float valor) {
		if (valor>0 && valor<=saldo) {
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	
	public boolean depositar(float valor) {
		if (valor>0) {
			
			saldo+=valor;
			return true;
		}
		return false;
	}
	
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	
	public Conta(int id, String nome, String email, boolean especial, short numero, byte digito, short agencia,
			float saldo, Cliente cliente) {
		
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}


	public Conta() {
		super();
	}
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
