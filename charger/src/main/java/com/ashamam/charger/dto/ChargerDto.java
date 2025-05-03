package com.ashamam.charger.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charger_info")
public class ChargerDto {

	@Id
	private Integer id;
	private String name;
	private String watt;
	
	public ChargerDto() {
		
	}
	
	public ChargerDto(Integer id, String name, String watt) {
		super();
		this.id = id;
		this.name = name;
		this.watt = watt;
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
	public String getWatt() {
		return watt;
	}
	public void setWatt(String watt) {
		this.watt = watt;
	}
	@Override
	public String toString() {
		return "ChargerDto [id=" + id + ", name=" + name + ", watt=" + watt + "]";
	}
	
	
	
}
