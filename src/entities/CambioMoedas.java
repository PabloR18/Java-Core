package entities;

public class CambioMoedas {
    
    public static final double DOLAR = 4.91;
    public static final double EURO = 5.38;
    public static final double YUAN = 0.68;
    
    public double quantidadeInformada;
    
    public double calculoDoDolar(double quantidadeInformada) {
   	 return DOLAR * quantidadeInformada;
    }
    
    public double calculoDoEuro(double quantidadeInformada) {
   	 return EURO * quantidadeInformada;
    }
    
    public double calculoDoYuan(double quantidadeInformada) {
   	 return quantidadeInformada * YUAN;
    }
    
    //Desenvolvedor: Pablo Rodrigues
    //Github: https://github.com/PabloR18

}
