package util.heranca;

/**
 * Representa uma conta bancária de uma empresa
 * 
 * @author Pablo Rodrigues de Oliveira
 * @version 1.0
 */
public class ContaEmpresa extends Conta {
	/**
	 * Limite para realizar empréstimo
	 */

	private Double limiteEmprestimo;

	/**
	 * Construtor padrão
	 */

	public ContaEmpresa() {

	}

	/**
	 * Construtor personalizado
	 * 
	 * @param numeroDaConta    Representa o número da conta, herdado da classe Pai
	 * @param titularDaConta   Representa o dono da conta, herdado da classe Pai
	 * @param saldoDaConta     Representa o saldo da conta, herdado da classe Pai
	 * @param limiteEmprestimo Representa o limite para emprestimo.
	 */
	public ContaEmpresa(Integer numeroDaConta, String titularDaConta, Double saldoDaConta, Double limiteEmprestimo) {
		super(numeroDaConta, titularDaConta, saldoDaConta);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	/**
	 * Obtém o limite de emprestimo da conta
	 * 
	 * @return retorna o limite de emprestimo
	 */

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	/**
	 * Determina um limite de emprestimo para a conta
	 * 
	 * @param limiteSaque Representa o novo limite para empréstimo da conta
	 */

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	/**
	 * Realizar um empréstimo na conta empresa
	 * 
	 * @param quantidade Representa o valor do emprestimo
	 */

	public void emprestimo(double quantidade) {
		if (quantidade <= limiteEmprestimo) {
			depositar(quantidade);
			System.out.println("O valor de " + quantidade + " Foi adicioando a sua conta!!");
		} else {
			System.out.println("O valor limite do empréstimo é de R$1000,00");
			emprestimo(quantidade);
		}
	}

}
