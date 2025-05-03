package com.ashamam.pan.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pan_card_info")
public class PanDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String panNum;
	public PanDto() {
	
	}
	public PanDto(Integer id, String name, String panNum) {
		super();
		this.id = id;
		this.name = name;
		this.panNum = panNum;
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
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	@Override
	public String toString() {
		return "PanDto [id=" + id + ", name=" + name + ", panNum=" + panNum + "]";
	}
	
	
	
}
