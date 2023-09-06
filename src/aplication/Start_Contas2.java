package aplication;

import java.util.Scanner;

import util.heranca.ContaEmpresa;

public class Start_Contas2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número da Conta: ");
		int numeroDaConta = entrada.nextInt();
		
		System.out.printf("Informe o nome do titular da conta: ");
		String titular = entrada.next();
		
		System.out.print("Informe o limite para saque: ");
		double limiteSaque = entrada.nextDouble();
		
		ContaEmpresa XPTO = new ContaEmpresa(numeroDaConta, titular, 0.0, limiteSaque);
		
		System.out.print(XPTO.getNumeroDaConta()+ "\n" + XPTO.getTitularDaConta() + "\n" + XPTO.getSaldoDaConta() + "\n" + XPTO.getLimiteEmprestimo());
		
		entrada.close();

	}

}
