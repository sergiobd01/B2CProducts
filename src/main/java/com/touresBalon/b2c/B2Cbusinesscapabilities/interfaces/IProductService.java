package com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;

public interface IProductService {
	BaseProductResponse findProductById (FindProductRequest request);
	List<BaseProductResponse> findAllProducts(FindProductRequest request, Pageable pageable);
	

}
