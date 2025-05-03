package com.xworkz.choclate.service;

import java.util.List;

import com.xworkz.choclate.dto.ChoclateDto;

public interface ChoclateService {
	
	public boolean createAll(List<ChoclateDto> data);
	
	public List<ChoclateDto> readAll();
	
	public ChoclateDto findByColorAndWeight(String color, int weight);
	
	public ChoclateDto findByPriceAndName(int price, String name);
	
	public boolean updateWeightByNameAndColor(int weight, String name, String color);

	public boolean updateNameByidAndWeight(String name, int id, int weight);
	
	public boolean deletebyColorAndName(String color, String name);
	
	public boolean updateNameById(String name, int id);
	
	public ChoclateDto findById(int id);
	
	public boolean deleteById(int id);
	
}
