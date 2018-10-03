package com.touresBalon.b2c.B2Cbusinesscapabilities.dto;

public class BaseProductResponse {
	private String name;
	private float price;
	private String spectacle_date;
	private String arrival_date;
	private String departure_date;
	private String transport_type;
	private String spectacle_type;
	private String logying_type;
	private String description;
	private String code;
	private String image_ref;
	private String source_city;
	private String target_city;
	private int id;
	
	public BaseProductResponse() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpectacle_date() {
		return spectacle_date;
	}

	public void setSpectacle_date(String spectacle_date) {
		this.spectacle_date = spectacle_date;
	}

	public String getArrival_date() {
		return arrival_date;
	}

	public void setArrival_date(String arrival_date) {
		this.arrival_date = arrival_date;
	}

	public String getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}

	public String getTransport_type() {
		return transport_type;
	}

	public void setTransport_type(String transport_type) {
		this.transport_type = transport_type;
	}

	public String getSpectacle_type() {
		return spectacle_type;
	}

	public void setSpectacle_type(String spectacle_type) {
		this.spectacle_type = spectacle_type;
	}

	public String getLogying_type() {
		return logying_type;
	}

	public void setLogying_type(String logying_type) {
		this.logying_type = logying_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImage_ref() {
		return image_ref;
	}

	public void setImage_ref(String image_ref) {
		this.image_ref = image_ref;
	}

	public String getSource_city() {
		return source_city;
	}

	public void setSource_city(String source_city) {
		this.source_city = source_city;
	}

	public String getTarget_city() {
		return target_city;
	}

	public void setTarget_city(String target_city) {
		this.target_city = target_city;
	}

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
