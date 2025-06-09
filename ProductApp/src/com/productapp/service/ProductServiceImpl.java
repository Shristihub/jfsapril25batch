package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.util.ProductDetails;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product[] getAll() {
		return ProductDetails.fetchProducts();
	}

	@Override
	public Product[] getByCategory(String category) throws ProductNotFoundException {
		// create a temp array to store the new set of products
		Product[] productsByCat = new Product[3];

		// create a temp variable for adding items in new array
		int x = 0;
		// get the product list
		Product[] products = ProductDetails.fetchProducts();
		// iterate thru the products array
		for (Product product : products) {
			// check if this products category is same as the parameter category
			if (product.getCategory().equals(category)) {
				// add the product to a temp array
				productsByCat[x] = product;
				x++;
			}
		}
		// check if the temo array has values. if not throw exception
		if (productsByCat[0]== null) {
			throw new ProductNotFoundException("category not found");
		}

		return productsByCat;
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		// get the product list
		Product[] products = ProductDetails.fetchProducts();
		// iterate thru the products array
		for (Product product : products) {
			// check if this products id == id that is coming in the parameter
			if (product.getProductId() == productId) {
				return product;
			}
		}
		return null;
	}

}
