package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Entertainment", schema = "dbo")
public class Entertainment {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
 	@Column(name = "IDENTERTAINMENT")
	private int idEntertainment;
	@Column(name = "PRICE")
	private float price;
	@Column(name = "NAME")
	private String name;
	
	
	public Entertainment() {
		// TODO Auto-generated constructor stub
	}


	public Entertainment(int idEntertainment, float price, String name) {
		super();
		this.idEntertainment = idEntertainment;
		this.price = price;
		this.name = name;
	}


	public int getIdEntertainment() {
		return idEntertainment;
	}


	public void setIdEntertainment(int idEntertainment) {
		this.idEntertainment = idEntertainment;
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
