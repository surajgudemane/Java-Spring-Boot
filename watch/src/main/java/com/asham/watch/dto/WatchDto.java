package com.asham.watch.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name = "watch_info")
public class WatchDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String brandName;
	private String madeIn;
	private String type;
	private Boolean waterResistat;
	private Integer price;
	
	
	public WatchDto(Integer id, String brandName, String madeIn, String type, Integer price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.madeIn = madeIn;
		this.type = type;
		this.price = price;
	}
	public WatchDto() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "WatchDto [id=" + id + ", brandName=" + brandName + ", madeIn=" + madeIn + ", type=" + type + ", price="
				+ price + "]";
	}
	
	
	
}
