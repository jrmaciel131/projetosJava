package entidades;

public class conta {
	private int numero;
	private String Titular;
	private double saldo;

	public conta(int numero, String titular) {
		this.numero = numero;
		Titular = titular;
	}

	public conta(int numero, String titular, double depositoinicial) {
		this.numero = numero;
		Titular = titular;
		deposito(depositoinicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5;
	}
	public String toString() {
		return "Conta: " + numero + ", Titular: " + Titular + ", Saldo: RS: " + String.format("%.2f", saldo);
		
	}

}
