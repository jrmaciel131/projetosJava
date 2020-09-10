package program;

import java.util.Scanner;

import entidades.conta;

public class aplicação {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		conta conta1;

		System.out.println("entre com o numero da conta");
		int conta = sc.nextInt();
		System.out.println("Entre com seu nome");;
		String titular = sc.next();
		System.out.println("Existe deposito inicial?");
		char op = sc.next().toLowerCase().charAt(0);
		if (op  == 's') {
			System.out.println("Digite o valor inicial do deposito");
			double deposito = sc.nextDouble();
			conta1= new conta(conta, titular, deposito);
		}else {
			conta1 = new conta(conta, titular);
		}
		System.out.print(conta1);
		
		System.out.println("Gostaria de fazer um deposito?");
		op = sc.next().toLowerCase().charAt(0);
		
		if (op  == 's') {
			System.out.println("Entre com o valor do deposito");
			double deposito = sc.nextDouble();
			conta1.deposito(deposito);
			System.out.println("Novo Saldo: ");
			System.out.print(conta1);
		}
		
		System.out.println("\nGostaria de fazer um saque?");
		op = sc.next().toLowerCase().charAt(0);
		
		if (op  == 's') {
			System.out.println("\nEntre com o valor de saque");
			double saque = sc.nextDouble();
			conta1.saque(saque);
			System.out.println("Novo Saldo: ");
			System.out.print(conta1);
		}else {
			System.out.println("Operação finalizada;");
			
		}
		sc.close();
	}

}
