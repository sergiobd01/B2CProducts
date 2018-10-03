package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

public enum Country {
	
	COLOMBIA(1,"Colombia"),
	ARGENTINA(2,"Argentina"),
	MEXICO(3,"Mexico");
	
	private int idCountry;
	
	private String country;
	
	Country(int idCountry, String country ) {
		this.idCountry = idCountry;
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getIdCountry() {
		return idCountry;
	}
}
