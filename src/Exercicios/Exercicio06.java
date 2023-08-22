package Exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		float valorA = 3.0f;
		float valorB = 4.0f;
		float valorC = 5.2f;
		final double pi = 3.14159;
		
		double trianguloRetangulo = (valorA * valorC) / 2;
		double areaCirculo = pi * (valorC * valorC);
		double trapezio = (valorA + valorB) * valorC / 2;
		double areaQuadrado = valorB * valorB;
		double areaRetangulo = valorA * valorB;
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f", areaRetangulo);
	}

}
