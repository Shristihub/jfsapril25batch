package com.productapp.model;

public class Product {
  private String productName;
  private int productId;
  private String category;
  private double price;

  public Product() {
	super();
  }

public Product(String productName, int productId, String category, double price) {
	super();
	this.productName = productName;
	this.productId = productId;
	this.category = category;
	this.price = price;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product [productName=" + productName + ", productId=" + productId + ", category=" + category + ", price="
			+ price + "]";
}


  
  
}
