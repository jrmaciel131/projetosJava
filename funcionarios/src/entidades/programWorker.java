package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.eneums.levelfuncionario;

public class programWorker {
	private String name;
	private levelfuncionario level;
	private Double baseSalarial;
	
	private departamento departament;
	private static List<horacontrato> contratos = new ArrayList<>();
	
	public programWorker() {
	}

	public programWorker(String name, levelfuncionario level, Double baseSalarial, departamento departament) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalarial = baseSalarial;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public levelfuncionario getLevel() {
		return level;
	}

	public void setLevel(levelfuncionario level) {
		this.level = level;
	}

	public Double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public departamento getDepartament() {
		return departament;
	}

	public void setDepartament(departamento departament) {
		this.departament = departament;
	}

	public List<horacontrato> getContratos() {
		return contratos;
	}
	
	public static void addcontrato(horacontrato cont) {
		contratos.add(cont);
	}
	
	public void removecontrato(horacontrato cont) {
		contratos.remove(cont);
	}
	
	public double ganho(int ano, int mes) {
		double sum = baseSalarial;
		Calendar cal = Calendar.getInstance();
		for (horacontrato c : contratos ) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes =	cal.get(Calendar.MONTH) + 1;	
			if (ano == c_ano && mes == c_mes) {
				sum += c.valorporhora();
			}
		}
		return sum;
	}
}
