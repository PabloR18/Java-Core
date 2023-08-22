package aplication;

import java.util.Scanner;

public class Start_Statico_1 {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		double radius;
		double c;
		double v;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do Raio: ");
		radius = entrada.nextDouble();
		c = circumference(radius);
		v = volume(radius);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f", PI);
		
		entrada.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
