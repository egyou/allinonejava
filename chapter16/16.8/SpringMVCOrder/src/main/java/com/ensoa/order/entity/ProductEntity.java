package com.ensoa.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ensoa.order.domain.Product;

@Entity
@Table(name = "PRODUCT")
public class ProductEntity {
	@Id
	@GeneratedValue
	@Column(name="PRODUCT_ID")
	private long id;
	private String name;
	private int price;
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String toString() {
		return "id : " + id + ", name : " + name + ", price : " + price + ", description : " + description;
	}
	public Product buildDomain() {
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		product.setDescription(description);
		return product;
	}
	public void buildEntity(Product product) {
		id =  product.getId();
		name = product.getName();
		price = product.getPrice();
		description = product.getDescription();
	}
}
