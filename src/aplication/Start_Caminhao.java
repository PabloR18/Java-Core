package aplication;

import java.util.Scanner;

import entities.Caminhao;

public class Start_Caminhao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a marca do Caminhão ?: ");
		String marca = entrada.next();
		
		System.out.printf("Quantos eixos tem o Caminhão ?: ");
		int eixos = entrada.nextInt();
		
		System.out.printf("Quantas toneladas tem o Caminhão ?: ");
		int toneladas = entrada.nextInt();
		
		Caminhao caminhaoVolvo = new Caminhao(marca, eixos, toneladas);
		
		System.out.printf("%s - %d - %d", marca, eixos, toneladas);
		
		entrada.close();

	}

}
