package com.packt.webstore.service;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.*;
public interface IProductService {

	public List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	Product getProductById(String productID);
	List<Product> getProductsByManufacturer(String manufacturer);
	Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterParams);
	void addProduct(Product product);
}
