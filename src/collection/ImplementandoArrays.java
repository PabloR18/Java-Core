package collection;

import java.util.Arrays;
import java.util.Scanner;

public class ImplementandoArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Exemplo 01 array notas de um aluno.
		
		double notasAlunoA[] = new double[3];
		
		
		//Atribuindo valores ao array
		
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		// exibir dados
		
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2] + "\n");
		
		// Exibindo por meio de um método da classe Arrays.
		
		System.out.println("Uso do metodo: " + Arrays.toString(notasAlunoA));
		
		// Formas de percorrer um array.
		
		System.out.println("\nUso do FOR: ");
		
		double notas = 0.0;
		for (int i = 0; i < 3; i++) {
			notas = notasAlunoA[i];
			System.out.println(i + ": " + notas);
			
			// Calcular a média das notas
			
			notas += notasAlunoA[i];
		}
		
		System.out.printf("\nMédia das Notas: %.2f\n", notas / 3);
		
		entrada.close();

	}

}
