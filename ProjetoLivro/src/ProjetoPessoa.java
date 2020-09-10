import java.util.Scanner;

public class ProjetoPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pessoas[] p = new pessoas[2];
		livro[] l = new livro[3];

		p[0] = new pessoas("pedro", "M", 22);
		p[1] = new pessoas("Maria", "F", 23);

		l[0] = new livro("POO", "Guanabara", 30, p[1]);
		l[1] = new livro("SQL", "Guanabara", 50, p[1]);
		l[2] = new livro("PHP", "Guanabara", 120, p[0]);

		for (int i = 0; i <= p.length; i++) {
			System.out.println(l[i].detalhes());
		}
		System.out.println("Entre com id do livror");
		int id = sc.nextInt();
		if (id > p.length) {
			System.out.println("ID inesistente");
		} else {
			System.out.println("Entre com uma operação");
			System.out.println("1- abrir\n2 - fechar\n3 - folhear\n4 - avançar paginas\n5 - voltar paginas");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				l[id].abrir();
				break;
			case 2:
				l[id].fechar();
				break;
			case 3:
				System.out.println("Quantas PAG vc gostaria de folhear? ");
				int f = sc.nextInt();
				l[id].folhear(f);
			case 4:
				l[id].avancarPag();
				break;
			case 5:
				l[id].voltarPag();
				break;
			default:
				System.out.println("Op errada");
				break;
			}
		}
		for (int i = 0; i <= p.length; i++) {
			System.out.println(l[i].detalhes());
		}
	}
}
