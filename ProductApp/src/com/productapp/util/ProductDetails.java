package com.productapp.util;

import com.productapp.model.Product;

public class ProductDetails {

	public static Product[] fetchProducts() {
		return new Product[] {
				new Product("Television", 10, "Electronics", 90000.0),
				new Product("Laptop", 11, "Electronics", 120000.0),
				new Product("Shoes", 12, "Sports", 3000.0),
				new Product("Jacket", 13, "Sports", 2000.0),
				new Product("Ball", 14, "Sports", 900)
		};
	}
}
