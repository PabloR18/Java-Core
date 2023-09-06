package aplication;

import util.heranca.Conta;
import util.heranca.ContaEmpresa;
import util.heranca.ContaPoupanca;

public class Start_Contas {

	public static void main(String[] args) {
		Conta contaPF1 = new Conta(9572, "Pablo Rodrigues", 500.50);
		ContaEmpresa contaPJ1 = new ContaEmpresa(6544, "Hexagon", 1.000, 5000.00);
		ContaPoupanca contaPP1 = new ContaPoupanca(7812, "José Adriano", 300.00, 2.2);

		// UPCASTING -> Converter um objeto da subclasse para superclasse.

		Conta contaPF2 = contaPJ1;
		Conta contaPF3 = new ContaEmpresa(2113, "Fernando", 0.0, 200.0);
		Conta contaPF4 = new ContaPoupanca(1177, "Victor", 15.00, 0.10);
		
		// DOWNCASTING
		
		ContaEmpresa contaPF5 = (ContaEmpresa)contaPF3;
		ContaEmpresa contaPF6 = (ContaEmpresa)contaPF3;
		contaPF6.emprestimo(100.00);

	}

}
