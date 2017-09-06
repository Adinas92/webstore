package com.packt.webstore.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.packt.webstore.domain.Product;
import com.packt.webstore.exception.ProductNotFoundException;
import com.packt.webstore.service.IProductService;

@Component
public class ProductIdValidator implements ConstraintValidator<IProductId, String>{
	
	@Autowired
	private IProductService productService;

	public void initialize(IProductId constraintAnnotation) {
		//  celowo pozostawione puste;
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		Product product;
		try {
			//jezeli produktu nie znaleziono o podanej wartosci to dobrze zwracany jest wyjatek ze nie ma
			product = productService.getProductById(value);
			
		} catch (ProductNotFoundException e) {
			return true;
		}
		// jezeli rozny od nulla to niestety istnieje produkt o takiej samej nazwie
		if(product!= null) {
			return false;
		}
		
		return true;
	}
	
}
