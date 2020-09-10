package entidades;

import java.util.Date;

public class horacontrato {
	private Date date;
	private Double valorphora;
	private Integer horas;
	
	public double valorporhora() {
		return valorphora * horas;
	}
	
	public horacontrato() {		
	}

	public horacontrato(Date date, Double valorphora, Integer horas) {
		this.date = date;
		this.valorphora = valorphora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorphora() {
		return valorphora;
	}

	public void setValorphora(Double valorphora) {
		this.valorphora = valorphora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
}
