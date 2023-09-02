package util;

import java.util.Date;

import collection.StatusPedidos;

public class Pedido {
	private Integer id;
	private Date instante;
	private StatusPedidos status;

	public Pedido() {

	}

	public Pedido(Integer id, Date instante, StatusPedidos status) {
		this.id = id;
		this.instante = instante;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public StatusPedidos getStatus() {
		return status;
	}

	public void setStatus(StatusPedidos status) {
		this.status = status;
	}

	public String toString() {
		return "Pedido ID = " + id + "\nHora = " + instante + "\nStatus = " + status;
	}
	
	
}
