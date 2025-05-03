package com.ashamam.phone.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone_info")
public class PhoneDto {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer price;
	
	public PhoneDto(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}

	public PhoneDto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PhoneDto [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
