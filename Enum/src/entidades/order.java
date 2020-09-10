package entidades;

import java.util.Date;

import entidades.enums.orderStatus;

public class order {
	private Integer id;
	private Date moment;
	private orderStatus status;
	
	public order() {
		
	}

	public order(Integer id, Date moment, orderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public orderStatus getStatus() {
		return status;
	}

	public void setStatus(orderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
