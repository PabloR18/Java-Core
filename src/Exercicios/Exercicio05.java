package Exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		int codigoPeca01 = 0;
		int quantidadePeca01 = 0;
		double valorPeca01 = 0;
		
		int codigoPeca02 = 0;
		int quantidadePeca02 = 0;
		double valorPeca02 = 0;
		
		double total = (quantidadePeca01 * valorPeca01) + (quantidadePeca02 * valorPeca02);
		
		System.out.printf("VALOR A PAGAR: R$%.2f", total);
	}

}
