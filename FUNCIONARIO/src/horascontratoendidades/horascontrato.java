package horascontratoendidades;

import java.util.Date;

public class horascontrato {
	private Date date;
	private Double valorporhora;
	private Integer horas;
	
	public horascontrato() {
		
	}
	
	public horascontrato(Date date, Double valorporhora, Integer horas) {
		super();
		this.date = date;
		this.valorporhora = valorporhora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorporhora() {
		return valorporhora;
	}

	public void setValorporhora(Double valorporhora) {
		this.valorporhora = valorporhora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public double valortoal(){
		return valorporhora*horas;
	}
}
