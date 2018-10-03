package com.touresBalon.b2c.B2Cbusinesscapabilities.consumer;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;

@Repository("Product")
public interface IProductRepositoryConsumer extends JpaRepository<Product, String> {
	
	@Query("SELECT t FROM Product t where t.name like :name OR t.description like :description")
    public List<Product>  findByNameAndDescription(@Param("name") String name, 
            @Param("description") String description, Pageable pageRequest);
	
	@Query("SELECT t FROM Product t where t.idProduct = :idProduct")
    public Product findById(@Param("idProduct") int idProduct);
	
	@Query("SELECT t FROM Product t")
	 public List<Product>  findAllProducts(Pageable pageRequest);
}
