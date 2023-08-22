package util;

public class Deslocamento {
	
	// ATRIBUTOS
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double speed;
	
	// CONSTRUTORES
	
	public Deslocamento() {
		 this.x1 = 0.00;
		 this.x2 = 0.00;
		 this.y1 = 0.00;
		 this.y2 = 0.00;
		 this.speed = 0.00;
	}
	
	public Deslocamento(double x1, double x2, double y1, double y2, double speed) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.speed = speed;
	}
	
	// GETS E SETS
	
	public double getX1() {
		return x1;
	}
	
	public void setX1(double x1) {
		this.x1 = x1;
	}
	
	public double getX2() {
		return x2;
	}
	
	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	public double getY1() {
		return y1;
	}
	
	public void setY1(double y1) {
		this.y1 = y1;
	}
	
	public double getY2() {
		return y2;
	}
	
	public void setY2(double y2) {
		this.y2 = y2;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	// MÉTODO PARA CALCULAR DISTANCIA ENTRE DOIS PONTOS
	
	public double calcularDistancia() {
		double distancia = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		return distancia;
	}
	
	// MÉTODO PARA CALCULAR TEMPO DE DESLOCAMENTO
	
	public double calcularTempo() {
		double tempo = calcularDistancia() / speed;
		return tempo;
	}
}