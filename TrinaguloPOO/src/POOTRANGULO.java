import java.util.Scanner;

import entidades.poo;

public class POOTRANGULO {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		poo x, y;
		x = new poo();
		y = new poo();
		
		
		System.out.println("Entre com os valores do trangulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os valores do trangulo y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		
		if (poo.area(x.a, x.b, x.c) > poo.area(y.a, y.b, y.c)) {
			System.out.printf("Area de x é %.4f%nArea de y é %.4f\n", poo.area(x.a, x.b, x.c), poo.area(y.a, y.b, y.c));
			System.out.println("O Maior é o X");
		}else {
			System.out.printf("Area de x é %.4f%nArea de y é %.4f\n", poo.area(x.a, x.b, x.c), poo.area(y.a, y.b, y.c));
			System.out.println("O maior é y");
		}
		sc.close();
	}
	

}
