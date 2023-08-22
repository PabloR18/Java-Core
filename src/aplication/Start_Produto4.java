package aplication;

import java.util.Scanner;

import entities.Produto;

public class Start_Produto4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double preco;
		int quantidade;
		
		Produto product; 
		product = new Produto(null, 0, 0);
		
		System.out.println("Informe os detalhes do produto!!");
		System.out.print("Nome: ");
		nome = entrada.next();
		product.setNome(nome);
		
		System.out.print("Preço: ");
		preco = entrada.nextDouble();
		product.setPreco(preco);

		System.out.print("Quantidade: ");
		quantidade = entrada.nextInt();
		product.adicionarProduto(quantidade);
		System.out.println();
		
		System.out.println();
		System.out.printf("Informações do Produto:%nNome: %s%nValor: R$%.2f%nQtd: %.0f%n", product.getNome(), product.getPreco(), product.getQuantidade());
		System.out.println();
		
		
		System.out.println("Valor total em Estoque: R$" + product.valorTotalEmEstoque());
		
		System.out.println("Informe a quantidade para adicionar: ");
		quantidade = entrada.nextInt();
		product.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.printf("Informações do Produto:%nNome: %s%nValor: R$%.2f%nQtd: %.0f%n", product.getNome(), product.getPreco(), product.getQuantidade());
		System.out.println();
		
		System.out.println("Valor total em Estoque: R$" + product.valorTotalEmEstoque());
		
		entrada.close();

	}

}
