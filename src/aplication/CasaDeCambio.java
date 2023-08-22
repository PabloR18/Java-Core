package aplication;

import java.util.Scanner;

import entities.CambioMoedas;

public class CasaDeCambio {

    public static void main(String[] args) {
   	 int selecaoMoeda;
   	 double result;
   	 
   	 CambioMoedas calcular;
   	 calcular = new CambioMoedas();
   	 
   	 Scanner entrada = new Scanner(System.in);
   	 
   	 System.out.printf("Selecione a Moeda que Deseja Comprar:%n 1 - Dolar%n 2 - Euro%n 3 - Yuan%n R= ");
   	 selecaoMoeda = entrada.nextInt();
   	 
   	 switch(selecaoMoeda) {
   	 case 1:
   		 System.out.print("Informe quantos Dolares deseja Comprar: ");
   		 calcular.quantidadeInformada = entrada.nextDouble();
   		 result = calcular.calculoDoDolar(calcular.quantidadeInformada);
   		 System.out.printf("Valor Total a pagar por US$%.2f Dolares: R$%.2f.",calcular.quantidadeInformada, result);
   		 break;
   	 case 2:
   		 System.out.print("Informe quantos Euros deseja Comprar: ");
   		 calcular.quantidadeInformada = entrada.nextDouble();
   		 result = calcular.calculoDoEuro(calcular.quantidadeInformada);
   		 System.out.printf("Valor Total a pagar por €%.2f Euros: R$%.2f.",calcular.quantidadeInformada, result);
   		 break;
   	 case 3:
   		 System.out.print("Informe quantos Yuans deseja Comprar: ");
   		 calcular.quantidadeInformada = entrada.nextDouble();
   		 result = calcular.calculoDoYuan(calcular.quantidadeInformada);
   		 System.out.printf("Valor Total a pagar por ¥%.2f Yuans: R$%.2f.",calcular.quantidadeInformada, result);
   		 break;
   	 default:
   		 System.out.println("Informe um valor Válido!!");
   		 break;
   	 }
   	 
   	 entrada.close();
   	 
   	 //Desenvolvedor: Pablo Rodrigues
   	 //Github: https://github.com/PabloR18

    }

}
