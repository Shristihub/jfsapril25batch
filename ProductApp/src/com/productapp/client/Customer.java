package com.productapp.client;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Customer {

	public static void main(String[] args) {
		IProductService productService = new ProductServiceImpl();
		Product[] products =  productService.getAll();
		System.out.println("All products");
		for (Product product : products) {
			System.out.println(product);
		}
		Product[] productsByCat;
		try {
			productsByCat = productService.getByCategory("Sportss");
			System.out.println("Products by category");
			for (Product product : productsByCat) {
				System.out.println(product);
			}
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Get By Id");
		Product product;
		try {
			product = productService.getById(10);
			System.out.println(product);
		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
