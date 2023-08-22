package aplication;

import java.util.Scanner;

import entities.Produto;

public class Start_ProdutosTwo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidade;
		
		System.out.println("Informe os detalhes do produto");
		System.out.print("Nome: ");
		String name = entrada.next();
		
		System.out.print("Preço (R$): ");
		double price = entrada.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		quantidade = entrada.nextInt();
		System.out.println();
		
		Produto product = new Produto(name, price, quantidade);
		
		System.out.println("Informações do produto: " + product);
		System.out.println();
		
		System.out.print("Insira o número de produtos a serem adicionados ao estoque: ");
		quantidade = entrada.nextInt();
		product.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		System.out.println();
		
		System.out.print("Insira o número de produtos a serem removidos do estoque: ");
		quantidade = entrada.nextInt();
		product.removerProduto(quantidade);
		System.out.println();
		
		System.out.println("Dados atualizados: " + product);
		
		entrada.close();

	}

}
