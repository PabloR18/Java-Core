package aplication;

import java.util.Scanner;

import util.Deslocamento;

public class Start_Deslocamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Deslocamento deslocamento;
		deslocamento = new Deslocamento(0, 0, 0, 0, 0);
		
		System.out.print("Informe a Distancia de X1: ");
		double x1 = entrada.nextDouble();
		deslocamento.setX1(x1);
		
		System.out.print("Informe a Distancia de X2: ");
		double x2 = entrada.nextDouble();
		deslocamento.setX2(x2);
		
		System.out.print("Informe a Distancia de Y1: ");
		double y1 = entrada.nextDouble();
		deslocamento.setY1(y1);
		
		System.out.print("Informe a Distancia de Y2: ");
		double y2 = entrada.nextDouble();
		deslocamento.setY2(y2);
		
		System.out.print("Informe a Velocidade: ");
		double velocidade = entrada.nextDouble();
		deslocamento.setSpeed(velocidade);
		
		double distancia = deslocamento.calcularDistancia();
		
		double tempo = deslocamento.calcularTempo();
		
		System.out.println();
		
		System.out.printf("Distancia: %.2f%nTempo: %.2f", distancia, tempo);
		
		entrada.close();

	}

}
