package com.oscar.demoMongo;
import org.hibernate.validator.constraints.NotEmpty;
 
import javax.validation.constraints.Size;
 
public final class ProductDTO {
 
    //@Size(max = Product.MAX_LENGTH_DESCRIPTION)
    private String name;
 
    //@NotEmpty
    //@Size(max = Todo.MAX_LENGTH_TITLE)
    private Double price;
 
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