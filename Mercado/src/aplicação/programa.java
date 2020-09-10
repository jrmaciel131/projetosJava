package aplicação;

import java.util.Scanner;

import entidades.produto;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		produto produto = new produto();
		
		System.out.println("Dados do Produto: ");
		System.out.print("Nome:");
		produto.name = sc.next();
		System.out.print("Preço: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.print(produto);
	}

}
