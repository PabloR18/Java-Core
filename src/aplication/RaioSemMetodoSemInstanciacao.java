package aplication;

import java.util.Scanner;

import util.CalculadoraComMetodosEstaticos;

public class RaioSemMetodoSemInstanciacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double c;
		double v;
		double raio;
		
		System.out.print("Informe o valor do Raio: ");
		raio = entrada.nextDouble();
		
		c = CalculadoraComMetodosEstaticos.circunferencia(raio);
		
		v = CalculadoraComMetodosEstaticos.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", CalculadoraComMetodosEstaticos.PI);
		
		entrada.close();

	}

}
