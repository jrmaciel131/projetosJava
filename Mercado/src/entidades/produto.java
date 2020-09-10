package entidades;

import java.util.Scanner;

public class produto {
	Scanner sc = new Scanner(System.in);
	public String name;
	public double price;
	public int quantidade;
	
	public produto(String name, double price, int quantidade) {
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
		
	}
	
	public double totalValueInStock() {
		return price * quantidade;
	}
	
	public void addprodutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerprodutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public String toString() {
		return "Produto:" + name + ", R$" + String.format("%.2f", price) + ", " + quantidade + " Unidades, Total: R$ " + String.format("%.2f", totalValueInStock());
	}
}
