package com.ashamam.mart.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "mart_info")
public class MartDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String item;
	private Integer price;
	
	public MartDto() {
		
	}

	public MartDto(String item, Integer price) {
		super();
		this.item = item;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MartDto [id=" + id + ", item=" + item + ", price=" + price + "]";
	}
	
	
	
}
