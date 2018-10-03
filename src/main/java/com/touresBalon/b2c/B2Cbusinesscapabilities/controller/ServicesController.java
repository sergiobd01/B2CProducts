package com.touresBalon.b2c.B2Cbusinesscapabilities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductService;

@RefreshScope
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ServicesController {

  @Autowired private IProductService productService;
	
  @RequestMapping(
      value = "/getProduct",
      method = RequestMethod.POST,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<BaseProductResponse> getProduct( @RequestBody FindProductRequest findProductRequest) {
	  BaseProductResponse productResponse =
			  productService.findProductById(findProductRequest);
		    return new ResponseEntity<>(productResponse, HttpStatus.OK);
  }
  

  @RequestMapping(
	      value = "/getProductList",
	      method = RequestMethod.POST,
	      produces = MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody ResponseEntity<Object> getAllOrFilterProducts(@RequestBody FindProductRequest findProductRequest,  Pageable pageable)  {
	List<BaseProductResponse> productResponse = productService.findAllProducts(findProductRequest, pageable);
	return new ResponseEntity<Object>(productResponse, HttpStatus.OK);
}
 
  

}
