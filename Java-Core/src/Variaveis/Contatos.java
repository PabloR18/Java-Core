package Variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INSIRA SEU NOME: ");
		String nome = entrada.next();
		
		System.out.println("INSIRA SEU E-MAIL: ");
		String email = entrada.next();
		
		System.out.println("INSIRA SEU NÚMERO DE TELEFONE: ");
		long telefone = entrada.nextLong();
		
		System.out.printf("Dados: %n%s%n%s%n%d", nome, email, telefone);
		
		entrada.close();

	}

}
