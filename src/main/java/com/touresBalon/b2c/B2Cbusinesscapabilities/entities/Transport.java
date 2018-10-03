package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Transport", schema = "dbo")
public class Transport  {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
 	@Column(name = "IDTRANSPORT")
	private int idTransport;
	@Column(name = "PRICE")
	private float price;
	@Column(name = "NAME")
	private String name;
	
	public Transport() {
	}

	public Transport(int idTransport, float price, String name) {
		super();
		this.idTransport = idTransport;
		this.price = price;
		this.name = name;
	}

	public int getIdTransport() {
		return idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
