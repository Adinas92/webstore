package com.packt.webstore.domain.repository;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.*;

public interface IProductRepository {
	
	List <Product> getAllProducts();
	Product getProductById(String productId);
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterParams);
	List<Product> getProductsByManufacturer (String manufacturer);
	void addProduct(Product product);
	
	
	
}
