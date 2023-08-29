package revisao;

import java.util.Scanner;

public class ImplementacaoArray {
	private double notasAluno[] = new double[4];

	public void adicionarElementosArray(Scanner entrada) {
		
		System.out.println("Informe as notas do aluno " + informeOAluno(entrada));
		System.out.printf("Insira a 1° nota do Aluno: ");
		notasAluno[0] = entrada.nextDouble();
		
		System.out.printf("Insira a 2° nota do Aluno: ");
		notasAluno[1] = entrada.nextDouble();

		System.out.printf("Insira a 3° nota do Aluno: ");
		notasAluno[2] = entrada.nextDouble();
		
		System.out.printf("Insira a 4° nota do Aluno: ");
		notasAluno[3] = entrada.nextDouble();
		
	}
	
	public String informeOAluno(Scanner entrada) {
		System.out.printf("Informe o nome do Aluno: ");
		String nomeDoAluno = entrada.next();
		return nomeDoAluno;
	}
	
	public void exibirElementos() {
		for (int i = 0; i < notasAluno.length ; i++) {
			System.out.println(notasAluno[i]);
		}
		System.out.println("------------------------------");
	}
	
	
}
