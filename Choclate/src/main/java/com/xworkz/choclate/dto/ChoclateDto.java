package com.xworkz.choclate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "choclate_info")
@NamedQuery(name="readAll", query="Select read from ChoclateDto read")
@NamedQuery(name="findByColorAndWeight", query="Select find from ChoclateDto find where find.color=:color and weight=:weight")
@NamedQuery(name="findByPriceAndName", query="Select find from ChoclateDto find where find.price=:price and name=:name")
@NamedQuery(name="updateWeightByNameAndColor", query="Update ChoclateDto dto set dto.weight=:weight where dto.name=:name and dto.color=:color")
@NamedQuery(name="updateNameByidAndWeight", query="Update ChoclateDto dto set dto.name=:name where dto.id=:id and dto.weight=:weight")
@NamedQuery(name="deletebyColorAndName", query="Delete from ChoclateDto dto where dto.color=:color and dto.name=:name")
public class ChoclateDto {

	@Id
	private int id;
	private String name;
	private String color;
	private int weight;
	private int price;
	
	public ChoclateDto() {
		super();
	}

	public ChoclateDto(int id, String name, String color, int weight, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ChoclateDto [id=" + id + ", name=" + name + ", color=" + color + ", weight=" + weight + ", price="
				+ price + "]";
	}
	
	
}
