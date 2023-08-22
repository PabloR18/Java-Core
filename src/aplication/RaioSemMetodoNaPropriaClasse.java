package aplication;

import java.util.Scanner;

import util.Calculadora;

public class RaioSemMetodoNaPropriaClasse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		double c;
		double v;
		double raio;
		
		System.out.print("Informe o valor do Raio: ");
		raio = entrada.nextDouble();
		
		c = calc.circunferencia(raio);
		
		v = calc.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calc.PI);
		
		entrada.close();

	}

}
