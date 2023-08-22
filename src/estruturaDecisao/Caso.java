package estruturaDecisao;

import java.util.Scanner;

public class Caso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha um número de 1 a 10: ");
		int valorInformado = entrada.nextInt();
		
		switch (valorInformado) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("Você GANHOU!!!!");
			System.out.println("Retire seu Prêmio na Bancada!!!!!");
			break;
		case 8:
		case 9:
		case 10:
		}
		
		entrada.close();

	}

}
