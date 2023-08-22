package estruturaDecisao;

import java.util.Scanner;

public class SeTwo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0;
		
		System.out.println("Insira o 1° valor:");
		valor1 = entrada.nextDouble();
		
		if(valor1 != 0) {
			System.out.println("Insira o 2° valor:");
			valor2 = entrada.nextDouble();
			
			if(valor2 != 0) {
				System.out.println("Insira o 3° valor:");
				valor3 = entrada.nextDouble();
				
				if(valor3 != 0) {
					System.out.println("Insira o 4° valor:");
					valor4 = entrada.nextDouble();
					
					if(valor4 != 0) {
						System.out.println("Insira o 5° valor:");
						valor5 = entrada.nextDouble();
						
						if(valor5 != 0) {
							
						}else {
							System.out.println("Não pode por 0");
						}
					}else {
						System.out.println("Não pode por 0");
					}
				}else {
					System.out.println("Não pode por 0");
				}
			}else {
				System.out.println("Não pode por 0");
			}
		}else {
			System.out.println("Não pode por 0");
		}
		
		double total = valor1 + valor2 + valor3 + valor4 + valor5;
		
		System.out.printf("A soma dos valores foram: %.2f", total);
		
		entrada.close();

	}

}
