//package com.packt.webstore.validator;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.packt.webstore.domain.Product;
//import com.packt.webstore.service.IProductService;
//
//@Component
//public class CategoryValidator implements ConstraintValidator<ICategory, String>{ 
//
//	@Autowired
//	private IProductService productService;
//
//	private List<String> allowedCategories;
//	private List<Product> products;
//	public CategoryValidator() {
//		products = new ArrayList<Product>();
//		products = productService.getAllProducts();
//		getAllowedCategories();
//	}
//	
//	public String[] getAllowedCategories() {
//		String[] categories = new String [products.size()];
//		int i = 0;
//		for (Product product :  products) {
//			categories[i] = product.getCategory();
//			i++;
//		}
//		return categories;
//	}
//
//	
//	public void initialize(ICategory constraintAnnotation) {
//		//  celowo pozostawione puste;
//	}
//
//	public boolean isValid(String value, ConstraintValidatorContext context) {
//		for (String category :  allowedCategories) {
//			if(category.equals(value)) {
//				return true;
//			}			
//		}
//		return false;
//	}
//	
//}
//
