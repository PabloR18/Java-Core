package entities;

public class Conta {
	private String nomeDoTitular;
	private int numeroDaConta;
	private double saldo;
	
	// Construtores -------------------------------------------------------------------
	
	public Conta(String nomeDoTitular, int numeroDaConta) {
		this.nomeDoTitular = nomeDoTitular;
		this.numeroDaConta = numeroDaConta;
	}

	public Conta(String nomeDoTitular, int numeroDaConta, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	// Gets e 7s ----------------------------------------------------------------------

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// Metodo Depositar ---------------------------------------------------------------
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	public void sacar(double valorSaque) {
		saldo -= valorSaque + 5.00;
	}
	
	

	
	
	
	
	
}
