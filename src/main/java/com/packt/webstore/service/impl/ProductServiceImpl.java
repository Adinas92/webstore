package com.packt.webstore.service.impl;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.IProductRepository;
import com.packt.webstore.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	//private List<Product> listOfProducts = new ArrayList<Product>();
	
	@Autowired
	private IProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.getAllProducts();	
	}
	public List<Product> getProductsByCategory(String category){
		return productRepository.getProductsByCategory(category);
	}
	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}
	public Set<Product> getProductsByPriceFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByPriceFilter(filterParams);
	}
	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}
	public List<Product> getProductsByManufacturer(String manufacturer){		
		return productRepository.getProductsByManufacturer(manufacturer);
	}
	public void addProduct(Product product)
	{
		productRepository.addProduct(product);
		
	}
	

}
