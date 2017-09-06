package com.packt.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Order;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.IOrderRepository;
import com.packt.webstore.domain.repository.IProductRepository;
import com.packt.webstore.service.ICartService;
import com.packt.webstore.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	private IOrderRepository orderRepository;
	
	@Autowired
	private ICartService cartService;
	
	@Autowired
	private IProductRepository productRepository;
	
	public void processOrder(String productId, int count) {
		Product productById = productRepository.getProductById(productId);
		if(productById.getUnitsInStock() < count) {
			throw new IllegalArgumentException ("Zbyt mało towaru. Obecna liczba sztuk w magazynie: " + productById.getUnitsInStock());
		}
		productById.setUnitsInStock(productById.getUnitsInStock() - count);
	}
	
	public Long saveOrder(Order order) {
		Long orderId = orderRepository.saveOrder(order);
		cartService.delete(order.getCart().getCartId());
		return orderId;
	}
}
