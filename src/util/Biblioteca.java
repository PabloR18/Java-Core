package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	
	private List<String> biblioteca;
	
	public Biblioteca() {
		this.biblioteca = new ArrayList<>();
	}
	
	public void adicionarLivro(String idLivro, String titulo, String autor, String ano, String genero, String editora, String paginas) {
		this.biblioteca.add("ID: " + idLivro + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nGenêro: " + genero + "\nEditora: " + editora + "\nPaginas: " + paginas);
	}
	
	public List<String> getBiblioteca(){
		return biblioteca;
	}
	
	public void registrarLivro(Scanner entrada) {
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.print("Informe uma ID para o Livro: ");
		String idLivro = entrada.next();
		
		System.out.print("Informe o Titulo do Livro: ");
		String titulo = entrada.next();
		
		System.out.print("Informe o nome do Autor: ");
		String autor = entrada.next();
		
		System.out.print("Informe o ano do Livro: ");
		String anoLivro = entrada.next();
		
		System.out.print("Informe o genêro do Livro: ");
		String genero = entrada.next();
		
		System.out.print("Informe a editora do Livro: ");
		String editora = entrada.next();
		
		System.out.print("Informe quantas paginas tem o Livro: ");
		String paginas = entrada.next();
		
		adicionarLivro(idLivro, titulo, autor, anoLivro, genero, editora, paginas);
		
		System.out.println("Livro Adicionado com Sucesso!!");
		System.out.println("---------------------------------");
		System.out.println("");
	}
	
	public void exibirLivros() {
		List<String> biblioteca = getBiblioteca();
		System.out.println("");
		System.out.println("---------------------------------");
		for (String livros : biblioteca) {
			System.out.println(biblioteca);
		}
		System.out.println("---------------------------------");
		System.out.println("");
	}
	
	public void verBiblioteca(){
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Sua biblioteca possui " + this.biblioteca.size() + " Livro(s)!!");
		System.out.println("---------------------------------");
		System.out.println("");
	}

	public void menuBiblioteca(Scanner entrada) {
		System.out.println("----- Biblioteca Pessoal -----");
		System.out.println("1 - Ver biblioteca");
		System.out.println("2 - Adicionar Livro");
		System.out.println("3 - Ver Livros");
		System.out.println("4 - Remover Livro");
		System.out.println("5 - Sair");
		System.out.print("R > ");
		int escolha = entrada.nextInt();
		
		switch (escolha) {
		case 1 :
			verBiblioteca();
			menuBiblioteca(entrada);
			break;
		case 2 :
			registrarLivro(entrada);
			menuBiblioteca(entrada);
			break;
		case 3 :
			exibirLivros();
			menuBiblioteca(entrada);
			break;
		case 4 :
			removerLivro(null, entrada);
			menuBiblioteca(entrada);
			break;
		case 5:
			System.out.println("Você Saiu!!");
			break;
		default:
			System.out.println("Informe uma opção existente!!");
			menuBiblioteca(entrada);
			break;
		}
	}
	
	public void removerLivro(String idLivro, Scanner entrada) {
		int index = this.biblioteca.indexOf(idLivro);
		
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.print("Informe o ID ou Titulo do livro que deseja remover: ");
		index = entrada.nextInt();
		this.biblioteca.remove(index);
		System.out.println("Livro Removido com Sucesso!!");
		System.out.println("---------------------------------");
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
