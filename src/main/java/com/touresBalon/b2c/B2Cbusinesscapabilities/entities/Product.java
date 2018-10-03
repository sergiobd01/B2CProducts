package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name= "Product", schema = "dbo")
public class Product  {
	
	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 	@Column(name = "IDPRODUCT")
	    private int idProduct;
	 	@Column(name = "NAME")
	    private String name;
	 	@Column(name = "DESCRIPTION")
	    private String description;
		@Column(name = "PRICE")
	    private float price;
	 	@Column(name = "SPECTACLE_DATE")
	    private Date spectacle_date;
	 	@Column(name = "ARRIVAL_DATE")
	    private Date arrival_date;
	 	@Column(name = "DEPARTURE_DATE")
	    private Date departure_date;
	 	
	    @ManyToOne
	    @JoinColumn(name = "IDTRANSPORT", nullable = false)
		private Transport idTransport;
	    @ManyToOne
	    @JoinColumn(name = "IDENTERTAINMENT", nullable = false)
		private Entertainment idEntertainment;
	    @ManyToOne
	    @JoinColumn(name = "IDHOTEL", nullable = false)
		private Hotel idHotel;
	 	
	 	@Column(name = "CODE")
		private String code;
	 	@Column(name = "URLIMAGE")
		private String urlImage;
	 	@Column(name = "SOURCE_CITY")
		private int source_city;
	 	@Column(name = "TARGET_CITY")
		private int target_city;
	 	@Column(name = "DISCOUNTRATE")
	    private long discountRate;
		
		public Product() {
		}

		public Product(int idProduct, String name, float price, Date spectacle_date, Date arrival_date,
				Date departure_date, Transport transport, Entertainment entertainment, Hotel hotel, String code,
				String urlImage, int source_city, int target_city, long discountRate,String description) {
			super();
			this.idProduct = idProduct;
			this.name = name;
			this.price = price;
			this.spectacle_date = spectacle_date;
			this.arrival_date = arrival_date;
			this.departure_date = departure_date;
			this.idTransport = transport;
			this.idEntertainment = entertainment;
			this.idHotel = hotel;
			this.code = code;
			this.urlImage = urlImage;
			this.source_city = source_city;
			this.target_city = target_city;
			this.discountRate = discountRate;
			this.description = description;
		}

		public int getIdProduct() {
			return idProduct;
		}

		public void setIdProduct(int idProduct) {
			this.idProduct = idProduct;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public Date getSpectacle_date() {
			return spectacle_date;
		}

		public void setSpectacle_date(Date spectacle_date) {
			this.spectacle_date = spectacle_date;
		}

		public Date getArrival_date() {
			return arrival_date;
		}

		public void setArrival_date(Date arrival_date) {
			this.arrival_date = arrival_date;
		}

		public Date getDeparture_date() {
			return departure_date;
		}

		public void setDeparture_date(Date departure_date) {
			this.departure_date = departure_date;
		}

		public Transport getTransport() {
			return idTransport;
		}

		public void setTransport(Transport transport) {
			this.idTransport = transport;
		}

		public Entertainment getEntertainment() {
			return idEntertainment;
		}

		public void setEntertainment(Entertainment entertainment) {
			this.idEntertainment = entertainment;
		}

		public Hotel getHotel() {
			return idHotel;
		}

		public void setHotel(Hotel hotel) {
			this.idHotel = hotel;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getUrlImage() {
			return urlImage;
		}

		public void setUrlImage(String urlImage) {
			this.urlImage = urlImage;
		}

		public int getSource_city() {
			return source_city;
		}

		public void setSource_city(int source_city) {
			this.source_city = source_city;
		}

		public int getTarget_city() {
			return target_city;
		}

		public void setTarget_city(int target_city) {
			this.target_city = target_city;
		}

		public long getDiscountRate() {
			return discountRate;
		}

		public void setDiscountRate(long discountRate) {
			this.discountRate = discountRate;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
}
