package util.heranca;

/**
 * Está classe representa uma conta bancária.
 * 
 * @author Pablo Rodrigues de Oliveira
 * @since 04-09-2023
 */
public class Conta {
	// número da conta
	private Integer numeroDaConta;

	// titular da conta
	private String titularDaConta;

	// saldo da conta
	protected Double saldoDaConta;

	// construtor
	public Conta() {
		/*
		 * cria uma conta com os valores padrões para os atributos 'numeroDaConta e
		 * 'titularDaConta'.
		 */
		this.numeroDaConta = null;
		this.titularDaConta = null;
		this.saldoDaConta = 0.0;
	}

	/**
	 * construtor da classe que recebe os valores para os atributos personalizados:
	 * 'numeroDaConta', 'titularDaConta' e 'saldoDeConta'.
	 * 
	 * @param numeroDaConta  Representa o número da conta.
	 * @param titularDaConta Representa o dono da conta.
	 * @param saldoDaConta   Representa o atual saldo da conta.
	 */

	public Conta(Integer numeroDaConta, String titularDaConta, Double saldoDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		this.saldoDaConta = saldoDaConta;
	}

	/**
	 * Obter o número da conta
	 * 
	 * @return o número da conta
	 */

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	/**
	 * Definir o titular da conta
	 * 
	 * @param titularDaConta O novo titular da conta
	 */

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	/**
	 * Obtém o saldo da conta
	 * 
	 * @return O saldo da conta
	 */

	public Double getSaldoDaConta() {
		return saldoDaConta;
	}

	/**
	 * Realiza um saque na conta
	 * 
	 * @param quantidade representa o valor para o saque.
	 */

	public void sacar(double quantidade) {
		saldoDaConta -= quantidade;
	}

	/**
	 * Realiza um deposito na conta
	 * 
	 * @param quantidade representa o valor para o deposito.
	 */

	public void depositar(double quantidade) {
		saldoDaConta += quantidade;
	}

}
