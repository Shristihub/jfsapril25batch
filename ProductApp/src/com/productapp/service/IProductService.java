package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {

	Product[] getAll();
	Product[] getByCategory(String category)throws ProductNotFoundException;
	Product getById(int productId)throws ProductNotFoundException;
	
}
