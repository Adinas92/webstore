package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.ICustomerRepository;

@Repository
public class InMemoryCustomerRepository implements ICustomerRepository {

	private List<Customer> listCustomers = new ArrayList<Customer>();;
	
	public InMemoryCustomerRepository()
	{
//		Customer swiezak = new Customer(11, "Adrian", "Pieko");
//		swiezak.setNoOfOrdersMade(true);
//		
//		Customer mala =  new Customer(22, "Monia", "Kielce");
//		
//		Customer slomka = new Customer(33, "Daniel", "Pieko");
//		
//		listCustomers.add(swiezak);
//		listCustomers.add(mala);
//		listCustomers.add(slomka);
//		
	}
	
	public List<Customer> getAllCustomers()
	{
		return listCustomers;
	};
	
}
