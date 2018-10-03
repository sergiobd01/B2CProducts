package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Hotel", schema = "dbo")
public class Hotel {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
 	@Column(name = "IDHOTEL")
	private int idHotel;
	@Column(name = "PRICE")
	private float price;
	@Column(name = "NAME")
	private String name;
	
	public Hotel() {
	}
	
	public Hotel(int idHotel, float price, String name) {
		super();
		this.idHotel = idHotel;
		this.price = price;
		this.name = name;
	}



	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
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
