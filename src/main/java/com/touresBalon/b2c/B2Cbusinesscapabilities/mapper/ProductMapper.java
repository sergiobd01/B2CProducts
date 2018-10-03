package com.touresBalon.b2c.B2Cbusinesscapabilities.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.City;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductMapper;
@Service
public class ProductMapper implements IProductMapper {

	@Override
	public BaseProductResponse buildProductResponse(Product productInfoResponse) {
		BaseProductResponse productResponse = new BaseProductResponse();
		productResponse.setId(productInfoResponse.getIdProduct());
		productResponse.setCode(productInfoResponse.getCode());
		productResponse.setArrival_date(productInfoResponse.getArrival_date().toString());
		productResponse.setDeparture_date(productInfoResponse.getDeparture_date().toString());
		productResponse.setDescription(productInfoResponse.getName());
		productResponse.setImage_ref(productInfoResponse.getUrlImage());
		productResponse.setLogying_type(productInfoResponse.getHotel().getName());
		productResponse.setName(productInfoResponse.getName());
		
		for (City city:City.values()) {
			if(productInfoResponse.getSource_city()==city.getIdCity()) {
				productResponse.setSource_city(city.getCity());
			}
		}
		productResponse.setSpectacle_date(productInfoResponse.getSpectacle_date().toString());
		productResponse.setSpectacle_type(productInfoResponse.getEntertainment().getName());
		for (City city:City.values()) {
			if(productInfoResponse.getTarget_city()==city.getIdCity()) {
				productResponse.setTarget_city(city.getCity());
			}
		}
		productResponse.setTransport_type(productInfoResponse.getTransport().getName());
		productResponse.setPrice(productInfoResponse.getPrice());
		return productResponse;
	}

	@Override
	public List<BaseProductResponse> buildProductListResponse(List<Product> productsList) {
		List<BaseProductResponse> productList= new ArrayList<>();
		
		for(Product productInfoResponse: productsList) {
			BaseProductResponse productResponse = new BaseProductResponse();
			productResponse.setId(productInfoResponse.getIdProduct());
			productResponse.setCode(productInfoResponse.getCode());
			productResponse.setArrival_date(productInfoResponse.getArrival_date().toString());
			productResponse.setDeparture_date(productInfoResponse.getDeparture_date().toString());
			productResponse.setDescription(productInfoResponse.getName());
			productResponse.setImage_ref(productInfoResponse.getUrlImage());
			productResponse.setLogying_type(productInfoResponse.getHotel().getName());
			productResponse.setName(productInfoResponse.getName());
			
			for (City city:City.values()) {
				if(productInfoResponse.getSource_city()==city.getIdCity()) {
					productResponse.setSource_city(city.getCity());
				}
			}
			productResponse.setSpectacle_date(productInfoResponse.getSpectacle_date().toString());
			productResponse.setSpectacle_type(productInfoResponse.getEntertainment().getName());
			for (City city:City.values()) {
				if(productInfoResponse.getTarget_city()==city.getIdCity()) {
					productResponse.setTarget_city(city.getCity());
				}
			}
			productResponse.setTransport_type(productInfoResponse.getTransport().getName());
			productResponse.setPrice(productInfoResponse.getPrice());
			productList.add(productResponse);
			
		}
		return productList;
	}

}
