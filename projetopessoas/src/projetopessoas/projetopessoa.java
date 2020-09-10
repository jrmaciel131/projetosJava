package projetopessoas;

public class projetopessoa {

	public static void main(String[] args) {
		pessoa p1 = new pessoa();
		aluno a1 = new aluno();
		prof pr1 = new prof();
		funcionario f1 = new funcionario();
		
		p1.setNome("Pedro");
		a1.setNome("MARIA");
		pr1.setNome("Claudio");
		f1.setNome("Manuel");
		
		a1.setCurso("informatica");
		pr1.setSalario(2200.20);
		f1.setSetor("Estoque");
		
		pr1.receberaumento(120.40);
		f1.mudaTrabalho();
		a1.cancelarmatricula();
		
		System.out.println(p1.toString());
		System.out.println(a1.toString());
		System.out.println(pr1.toString());
		System.out.println(f1.toString());
	}

}
