package revisao;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Implementando uma lista tipo String.
		//List<tipo> nome = new ArrayList<>();
		List<String> lista = new ArrayList<>();
		
		// Adicionar elementos a lista
		
		lista.add("Filosofia");
		lista.add("Historia");
		lista.add("Sociologia");
		lista.add("Matématica");
		lista.add("Geografia");
		
		// Percorrer os elementos da lista
		
		for (String materias : lista) {
			System.out.println(materias + "\n");
		}
		
		// Percorrer com método toString.
		
		System.out.println(lista.toString());
		
		System.out.println("-------------------------------------------------------------------");
		
		// Inserir elementos entre um nodo
		
		lista.add(4, "Artes");
		lista.add("Francês");
		lista.add(5, "Programa");
		
		System.out.println(lista.toString());
		
		System.out.println("-------------------------------------------------------------------");
		
		// Verificar o tamanho da lista
		
		System.out.println("A lista possui um tamanho de " + lista.size() + " posições");
		System.out.println(lista.get(3));
		
		// Remover elemento da lista
		
		lista.remove(2);
		lista.remove("Francês");
		
		System.out.println(lista.toString());
		
		System.out.println("-------------------------------------------------------------------");
		
		// Listar a posição de um elemento
		
		System.out.println("Index de Filosofia: " + lista.indexOf("Filosofia"));

	}

}
