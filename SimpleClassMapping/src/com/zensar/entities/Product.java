package com.zensar.entities;

/**
 * @author Priya Mirchandani
 * @creation_date 25th sep 2019 4.44pm
 * @modification_date 25th sep 2019 4.44pm
 * @version 1.0
 * @copyright Zensar Technologies.all rights reserved
 * @description it is a persistence class
 *              it represnts databse table product
 *              its a pojo class 
 *
 */
public class Product {
private int productId;
private String name;
private String brand;
private double price;
public Product() 
{
	
}



public Product(int productId, String name, String brand, double price) {
	super();
	this.productId = productId;
	this.name = name;
	this.brand = brand;
	this.price = price;
}



public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}



 


}
