package projetopessoas;

public class prof extends pessoa{
	private String espc;
	private double salario;
	
	public void receberaumento(double x) {
		 this.salario=+x;
	}

	public String getEspc() {
		return espc;
	}

	public void setEspc(String espc) {
		this.espc = espc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
