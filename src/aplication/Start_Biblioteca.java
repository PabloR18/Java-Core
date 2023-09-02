package aplication;

import java.util.Scanner;

import util.Biblioteca;

public class Start_Biblioteca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Biblioteca biblioteca1 = new Biblioteca();
		
		biblioteca1.menuBiblioteca(entrada);
		
		entrada.close();

	}

}
