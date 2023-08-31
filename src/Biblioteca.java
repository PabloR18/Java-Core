package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	private String idLivro;
	private String titulo;
	private String autor;
	private String ano;
	private String genero;
	private String editora;
	private String paginas;
	private List<String> biblioteca = new ArrayList<>();
	
	public Biblioteca(String idLivro, String titulo, String autor, String ano, String genero, String editora,
			String paginas) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.genero = genero;
		this.editora = editora;
		this.paginas = paginas;
	}

	
	
	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getPaginas() {
		return paginas;
	}



	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public void menuBiblioteca(Scanner entrada) {
		
		System.out.println("----- Biblioteca Pessoal -----");
		System.out.println("1 - Ver biblioteca");
		System.out.println("2 - Adicionar Livro");
		System.out.println("3 - Ver Livros");
		System.out.println("4 - Remover Livro");
		System.out.print("R > ");
		int escolha = entrada.nextInt();
		
		switch (escolha) {
		case 1 :
			verBiblioteca();
			menuBiblioteca(entrada);
			break;
		case 2 :
			adicionarLivro(entrada);
			menuBiblioteca(entrada);
			break;
		case 3 :
			listarLivros();
			menuBiblioteca(entrada);
			break;
		case 4 :
			removerLivro(entrada);
			menuBiblioteca(entrada);
			break;
		default:
			System.out.println("Informe uma opção existente!!");
			menuBiblioteca(entrada);
			break;
		}
	}
	
	public void verBiblioteca() {
		System.out.println("Sua biblioteca possui " + biblioteca.size() + "Livros no momento!!");
	}
	
	public void adicionarLivro(Scanner entrada) {
		System.out.println("---------------------------------");
		System.out.print("Informe uma ID para o Livro: ");
		String idLivro = entrada.next();
		setIdLivro(idLivro);
		
		System.out.print("Informe o Titulo do Livro: ");
		String titulo = entrada.next();
		setTitulo(titulo);
		
		System.out.print("Informe o nome do Autor: ");
		String autor = entrada.next();
		setAutor(autor);
		
		System.out.print("Informe o ano do Livro: ");
		String anoLivro = entrada.next();
		setAno(anoLivro);
		
		System.out.print("Informe o genêro do Livro: ");
		String genero = entrada.next();
		setGenero(genero);
		
		System.out.print("Informe a editora do Livro: ");
		String editora = entrada.next();
		setEditora(editora);
		
		System.out.print("Informe quantas paginas tem o Livro: ");
		String paginas = entrada.next();
		setPaginas(paginas);
		
		System.out.println("Livro Adicionado com Sucesso!!");
		System.out.println("---------------------------------");
	}
	
	public void listarLivros() {
		System.out.println("ID: " + getIdLivro());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Ano: " + getAno());
		System.out.println("Genêro: " + getGenero());
		System.out.println("Editora: " + getEditora());
		System.out.println("Paginas: " + getPaginas());
	}
	
	public void removerLivro(Scanner entrada) {
		System.out.println("---------------------------------");
		System.out.print("Informe o ID ou Titulo do livro que deseja remover: ");
		String removerLivro = entrada.next();
		biblioteca.remove(removerLivro);
		System.out.println("Livro Removido com Sucesso!!");
		System.out.println("---------------------------------");
	}
	
	public void adicionarNaLista() {
		biblioteca.add(getIdLivro());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
