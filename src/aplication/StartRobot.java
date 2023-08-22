package aplication;

import entities.ExploradorRobo;

public class StartRobot {

	public static void main(String[] args) {
		
		ExploradorRobo alpha;
		alpha = new ExploradorRobo();
		
		alpha.status = "Explorando...";
		alpha.velocidade = 7;
		alpha.temperatura = 20;
		alpha.nome = "Alpha-0778";

		alpha.display();
		
		System.out.println("--------------------------------------");
		
		System.out.println("Aumentando velocidade...");
		
		alpha.velocidade = 10;
		
		alpha.display();
		
		System.out.println("--------------------------------------");
		
		System.out.println("Temperatura do ambiente mudou...");
		
		alpha.temperatura = 47;
		
		System.out.println("Verificandos condições climaticas...");
		
		alpha.temperaturaRetornar();
		
		alpha.display();
	}

}
