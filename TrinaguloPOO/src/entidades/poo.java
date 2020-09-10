package entidades;

public class poo {

	public double a;
	public double b;
	public double c;
	
	public static double area(double a, double b, double c) {
		double aux, areaf;
		aux =(a+b+c)/2;
		areaf = Math.sqrt(aux *(aux - a) * (aux - b) * (aux - c)  );
		return areaf;
		
	}
}
