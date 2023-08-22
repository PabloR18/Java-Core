package entities;

public class Produto {
	private String name;
	private double price;
	private int quantity;
	
	public Produto() {
		
	}
	
	public Produto (String nome, double preco, int quantidade) {
		this.name = nome;
		this.price = preco;
		this.quantity = quantidade;
	}
	
//	GETS E SETS
	
	public String getNome() {
		return name;
	}
	
	public void setNome(String nome) {
		this.name = nome;
	}
	
	public double getPreco() {
		return price;
	}
	
	public void setPreco(double preco) {
		this.price = preco;
	}
	
	public double getQuantidade() {
		return quantity;
	}
	
//	METODOS
	
	public void adicionarProduto(int quantidade) {
		this.quantity += quantity;
	}
	
	public double valorTotalEmEstoque() {
		return price * quantity;
	}
	
	public void removerProduto(int quantidade) {
		this.quantity -= quantidade;
	}
	
	public String toString() {
		return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: R$" + String.format("%.2f", valorTotalEmEstoque());
	}
}
