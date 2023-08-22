package Variaveis;

import java.util.Scanner;

public class trianguloAtividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double lado1x = 0;
		double lado2x = 0;
		double lado3x = 0;
		double pX;
		double areaX;
		double lado1y = 0;
		double lado2y = 0;
		double lado3y = 0;
		double pY;
		double areaY;
		
		System.out.print("Informe o primeiro lado de X: ");
		lado1x = entrada.nextDouble();
		
		System.out.print("Informe o segundo lado de X: ");
		lado2x = entrada.nextDouble();
		
		System.out.print("Informe o terceiro lado de X: ");
		lado3x = entrada.nextDouble();
		
		pX = (lado1x + lado2x + lado3x) / 2;
		
		areaX = Math.sqrt(pX * (pX - lado1x) * (pX - lado2x) * (pX - lado3x));
		
		System.out.printf("A área do triângulo X é: %.2f%n", areaX);
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.print("Informe o primeiro lado de Y: ");
		lado1y = entrada.nextDouble();
		
		System.out.print("Informe o segundo lado de Y: ");
		lado2y = entrada.nextDouble();
		
		System.out.print("Informe o terceiro lado de Y: ");
		lado3y = entrada.nextDouble();
		
		pY = (lado1y + lado2y + lado3y) / 2;
		
		areaY = Math.sqrt(pY * (pY - lado1y) * (pY - lado2y) * (pY - lado3y));
		
		System.out.printf("A área do triângulo Y é: %.2f%n", areaY);
		
		System.out.println();
		System.out.println("----- RESULTADO -----");
		System.out.println();
		
		if(areaX > areaY) {
			System.out.print("O triângulo com a maior área é X");
			
		}else if(areaX == areaY){
			System.out.println("Os lados dos dois triangulos são iguais.");
		}
		else {
			System.out.print("O triângulo com a maior área é Y");
		}
		
		entrada.close();

	}

}
