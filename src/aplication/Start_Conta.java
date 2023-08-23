package aplication;

import javax.swing.JOptionPane;

import entities.Conta;

public class Start_Conta {

	public static void main(String[] args) {
		
		Conta conta;
		
		int numeroDaConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da Conta: ", "Abertura da Conta", JOptionPane.PLAIN_MESSAGE));
		
		String donoConta = JOptionPane.showInputDialog(null, "Informe o nome do Titular", "Abertura da Conta", JOptionPane.PLAIN_MESSAGE);
		
		String seraQueVaiTerDeposito = JOptionPane.showInputDialog(null, "Deseja efetuar um Deposito Inicial ? ", "Abertura da Conta", JOptionPane.PLAIN_MESSAGE);
		
		// Aplicando metodo para transformar em MAIUSCULO

		seraQueVaiTerDeposito = seraQueVaiTerDeposito.toUpperCase();
		
		//Convertendo para CHAR pegando a primeira Letra da String
		
		char deposito = seraQueVaiTerDeposito.charAt(0);
		
		if(deposito == 'S') {
			double depositoInicialSim = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser Depositado", "Abertura de Conta", JOptionPane.PLAIN_MESSAGE )); 
			
			conta = new Conta(donoConta, numeroDaConta, depositoInicialSim);
		}else {
			conta = new Conta(donoConta, numeroDaConta);
		}
		
		//Exibir dados da conta
		
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);
		
		// Solicitando um deposito
		
		double depositoEmConta = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Deposito", "Deposito em Conta", JOptionPane.PLAIN_MESSAGE));
		conta.depositar(depositoEmConta);
		
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);
		
		// Solicitando um saque
		
		double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor que deseja Sacar", "Saque", JOptionPane.PLAIN_MESSAGE));
		conta.sacar(saque);
		
		JOptionPane.showMessageDialog(null, conta, "Dados da conta", JOptionPane.INFORMATION_MESSAGE);
	}

}
