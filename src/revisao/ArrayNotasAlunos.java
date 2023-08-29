package revisao;

import java.util.Scanner;

public class ArrayNotasAlunos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ImplementacaoArray alunoA = new ImplementacaoArray();
		alunoA.adicionarElementosArray(entrada);
		alunoA.exibirElementos();
		
		ImplementacaoArray alunoB = new ImplementacaoArray();
		alunoB.adicionarElementosArray(entrada);
		alunoB.exibirElementos();
		
		entrada.close();

	}

}
