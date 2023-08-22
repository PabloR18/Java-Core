package entities;

public class ExploradorRobo {
	public String status;
	public int velocidade;
	public double temperatura;
	public String nome;
	
	
	public void temperaturaRetornar() {
		if(temperatura > 45) {
			status = "Retornando para a base...";
			velocidade = 5;
		}
	}
	
	public void display() {
		System.out.println("ID: " + nome);
		System.out.println("Status: " + status + "...");
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Temperatura do ambiente: " + temperatura + "°");
	}
	
}
