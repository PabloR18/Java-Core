package test;

import java.util.Scanner;

import entities.ExploradorRobo;

public class TesteRobos {

	public static void main(String[] args) {
		ExploradorRobo omega, beta;
		omega = new ExploradorRobo();
		beta = new ExploradorRobo();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o Nome do 1° Robô: ");
		omega.nome = entrada.next();
		
		System.out.printf("Informe o Status do Robô %s : ", omega.nome);
		omega.status = entrada.next();
		
		System.out.printf("Informe o Velocidade do Robô %s : ", omega.nome);
		omega.velocidade = entrada.nextInt();
		
		System.out.printf("Informe a Temperatura em que o Robô %s se encontra: ", omega.nome);
		omega.temperatura = entrada.nextDouble();
		
		System.out.println("");
		
		System.out.print("Informe o Nome do 2° Robô: ");
		beta.nome = entrada.next();
		
		System.out.printf("Informe o Status do Robô %s : ", beta.nome);
		beta.status = entrada.next();
		
		System.out.printf("Informe o Velocidade do Robô %s : ", beta.nome);
		beta.velocidade = entrada.nextInt();
		
		System.out.printf("Informe a Temperatura em que o Robô %s se encontra: ", beta.nome);
		beta.temperatura = entrada.nextDouble();
		
		System.out.println("------------------------------------------------------------");
		
		omega.display();
		
		System.out.println("");
		
		beta.display();

		entrada.close();
	}

}
