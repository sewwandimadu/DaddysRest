package com.example.CoffeeShopAPI.Model;

import javax.persistence.*;

@Entity
public class Items {

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String img;
	
	private double price;

	private String name;
	
	private String descri;

	public Items(Integer id, String img, double price, String name, String descri) {
		super();
		this.id = id;
		this.img = img;
		this.price = price;
		this.name = name;
		this.descri = descri;
	}

	
	public Items() {}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescri() {
		return descri;
	}


	public void setDescri(String descri) {
		this.descri = descri;
	}
	
	
	
}
