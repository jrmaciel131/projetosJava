import java.util.Scanner;

public class NRU {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre com o numero de paginas /n");
	int pag = sc.nextInt();
	int[][] leitor = new int[pag][2];
	
	for(int i = 0; i <= pag - 1; i++) {
		System.out.println("Entre com o id de classificação para a pag" + i + "\n0 - não referenciada, não modificada\n1 - não referenciada, modificada\n+"
				+ "2 - referenciada, não modificada\n3 - referenciada, modificada");
		int aux = sc.nextInt();
		if (aux == 0) {
			leitor[i][0] = leitor[i][0];
			leitor[i][1] = leitor[i][0];
		}else if(aux == 1) {
			leitor[i][0] = leitor[i][0];
			leitor[i][1] = leitor[i][1];
		}else if (aux == 2) {
			leitor[i][1] = 1;
			leitor[i][1] = 0;
		}else {
			leitor[i][0] = leitor[i][1];
			leitor[i][1] = leitor[i][0];
		}
		
	}
	for(int i = 0; i <= pag; i++) {
		for(int j = 1; j <= 1; j++) {
			System.out.println(leitor[i][j]);
		}
	}
	
	
	
}
	}


