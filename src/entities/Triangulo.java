package entities;

public class Triangulo {

	//atributos da classe:
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	//metodo área:
	
	public double area() {
		double pX = (ladoA + ladoB + ladoC) / 2;
		
		return Math.sqrt(pX * (pX - ladoA) * (pX - ladoB) * (pX - ladoC));	
	}
	
	public void classificacaoTriangulo() {
		if(ladoA == ladoB && ladoB == ladoC) {
			System.out.println("(Equilatero)");
		}else if(ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
			System.out.println("(Isóceles)");
		}else {
			System.out.println("(Escaleno)");
		}
	}
}
