package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Aplicativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe as medidas do Triângulo X: : ");
		x.ladoA = entrada.nextDouble();
		x.ladoB = entrada.nextDouble();
		x.ladoC = entrada.nextDouble();
		
		System.out.println("");
		
		System.out.println("Informe as medidas do Triângulo Y: ");
		y.ladoA = entrada.nextDouble();
		y.ladoB = entrada.nextDouble();
		y.ladoC = entrada.nextDouble();
		
		double areaY = y.area();
		double areaX = x.area();
		
		System.out.println("");
		
		System.out.printf("Área de X: %.2f ", areaX);
		x.classificacaoTriangulo();
		System.out.println("");
		System.out.printf("Área de Y: %.2f ", areaY);
		y.classificacaoTriangulo();
		
		entrada.close();

	}

}
