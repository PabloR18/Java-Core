package exercicios;

import java.util.Locale;

public class ListaDeProdutos01 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measue = 53.234567;
		
		
		System.out.printf("Products:\n%s, which price is $%.2f \n%s, which price is $%.2f\nRecord: %d years old, code %d and gender: %s\nMeasue with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", product1, price1, product2, price2, age, code, gender, measue, measue);

		Locale locale = new Locale("en", "US");
		locale.setDefault(locale);
		
		System.out.printf("US decimal point: %.3f", measue);
	}

}
