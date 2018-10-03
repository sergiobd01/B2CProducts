package com.touresBalon.b2c.B2Cbusinesscapabilities.dto;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class FindProductRequest implements Pageable {
	private int idProduct;
	private String nameProduct;
	private String description;
	private boolean filtered;
	
	public FindProductRequest() {
		
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}
	
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isFiltered() {
		return filtered;
	}
	
	public void setFiltered(boolean filtered) {
		this.filtered = filtered;
	}

	@Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

}
