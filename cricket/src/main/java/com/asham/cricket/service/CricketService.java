package com.asham.cricket.service;

import java.util.List;

import com.asham.cricket.dto.CricketDto;

public interface CricketService {

	public String saveAll(CricketDto dto);
	
	public CricketDto findById(Integer id);
	
	public List<CricketDto> readAll();
	
	public String deleteById(Integer id);
	
}
