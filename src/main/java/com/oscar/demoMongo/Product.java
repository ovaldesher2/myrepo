package com.oscar.demoMongo;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")//MORE THAN IMPORTANT TO GET THE RESULTS
public class Product {

	@Id private String id;

	private Double price;
	private String name;
	
	public Double getPrice(){
		return price;
	}
	public void setPrice(Double p){
		price=p;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
}