package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.departamento;
import entidades.horacontrato;
import entidades.programWorker;
import entidades.eneums.levelfuncionario;

public class program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		System.out.println("Entre com o nome do departamento:");
		String nomedepartamento = sc.nextLine();
		System.out.print("Entre com o nome do trabalhador:");
		System.out.print("Name:");
		String nometrabalhador = sc.nextLine();
		System.out.print("Level:");
		String level = sc.nextLine().toLowerCase();
		System.out.print("base salarial:");
		double basesalarial= sc.nextDouble();
		
		programWorker trabalhador = new programWorker(nometrabalhador, levelfuncionario.valueOf(level), basesalarial, new departamento(nomedepartamento));
		
		System.out.println("Quantos contratos você possuiu?");
		int n = sc.nextInt();
		for (int i = 1;i <=n; i++) {
			System.out.println("Entre com o contrato #" + i + " data: ");
			System.out.println("Entre com a data");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Entre com o valor por hora ");
			double valorporhora = sc.nextDouble();
			System.out.println("Duração (horas)");
			int horas = sc.nextInt();
			horacontrato contratoh = new horacontrato(contractDate,valorporhora, horas);
			programWorker.addcontrato(contratoh);
			
		}

	}

}
