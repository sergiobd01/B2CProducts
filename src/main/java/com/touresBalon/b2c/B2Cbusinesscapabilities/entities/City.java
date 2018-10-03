package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

public enum City {
	
	BOGOTA(1,"Bogotá",Country.COLOMBIA),
	BUENOS_AIRES(2,"Buenos Aires",Country.ARGENTINA),
	GUAD(3,"Guadalajara",Country.MEXICO);
	
	private int idCity;
	
	private String city;
	
	private Country country;

	private City(int idCity, String city, Country country) {
		this.idCity = idCity;
		this.city = city;
		this.country = country;
	}

	public int getIdCity() {
		return idCity;
	}

	public String getCity() {
		return city;
	}

	public Country getCountry() {
		return country;
	}
	
	
}
