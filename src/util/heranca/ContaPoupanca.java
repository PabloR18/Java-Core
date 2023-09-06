package util.heranca;

public class ContaPoupanca extends Conta {
	private Double taxaDeSaque;

	public ContaPoupanca(Integer numeroDaConta, String titularDaConta, Double saldoDaConta, double taxaDeSaque) {
		super(numeroDaConta, titularDaConta, saldoDaConta);
		this.taxaDeSaque = taxaDeSaque;
	}

	public double getTaxaDeSaque() {
		return taxaDeSaque;
	}
	
	public void setTaxaDeSaque(double taxaDeSaque) {
		this.taxaDeSaque = taxaDeSaque;
	}
	
	public void atualizarSaldo() {
		saldoDaConta += saldoDaConta * taxaDeSaque;
	}

	public void saqueComTaxa(double quantidade) {
		double saqueTaxa = quantidade + getTaxaDeSaque();
		sacar(saqueTaxa);
	}
	
	
}
